package com.determent.der.reg.ui_cmp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.determent.der.reg.ui_cmp.reg_textfield.RegPhoneNumber
import dev.icerock.moko.resources.compose.stringResource
import org.example.library.MR

@Composable
fun ScreenReg(
    modifier: Modifier,
) {

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Spacer(
            modifier = Modifier
                .height(60.dp)
                .fillMaxWidth()
        )

        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = stringResource(MR.strings.auth_reg),
                fontSize = 20.sp,
                style = MaterialTheme.typography.labelSmall
            )
        }

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

}