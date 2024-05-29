package com.determent.der.android.preview

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.determent.der.reg.ui_cmp.auth_textfield.AuthPhoneNumber

@Preview
@Composable
private fun AuthPreviewPhoneNumber() {

    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {
        AuthPhoneNumber(
            onChange = { }
        )
    }

}
