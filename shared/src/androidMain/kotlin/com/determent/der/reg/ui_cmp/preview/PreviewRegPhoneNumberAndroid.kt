package com.determent.der.reg.ui_cmp.preview

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.determent.der.reg.ui_cmp.reg_textfield.RegPhoneNumber

@Preview
@Composable
private fun PreviewRegPhoneNumberAndroid() {

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        RegPhoneNumber(
            onChange = { },
            modifier = Modifier
                .height(58.dp)
                .fillMaxWidth()
                .padding(horizontal = 32.dp)
        )
    }

}
