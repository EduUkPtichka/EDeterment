package com.determent.der.reg.ui_cmp.preview

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.determent.der.reg.ui_cmp.ScreenReg
import dev.icerock.moko.resources.compose.colorResource
import org.example.library.MR

@Preview
@Composable
fun PreviewScreenRegAndroid() {
    ScreenReg(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(MR.colors.white))
    )
}