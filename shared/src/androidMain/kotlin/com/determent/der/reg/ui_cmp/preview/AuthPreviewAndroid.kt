package com.determent.der.reg.ui_cmp.preview

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.determent.der.reg.ui_cmp.auth_textfield.RegPhoneNumber

@Preview
@Composable
private fun AuthPreviewAndroidPhoneNumber() {

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        RegPhoneNumber(
            onChange = { }
        )
    }

}
