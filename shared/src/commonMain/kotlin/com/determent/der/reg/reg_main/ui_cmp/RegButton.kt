package com.determent.der.reg.reg_main.ui_cmp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import dev.icerock.moko.resources.compose.colorResource
import dev.icerock.moko.resources.compose.stringResource
import org.example.library.MR

@Composable
fun RegButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .height(50.dp)
            .clip(RoundedCornerShape(50))
            .fillMaxWidth()
            .background(colorResource(MR.colors.black))
        ,
        shape = RoundedCornerShape(50)
    ) {
        Text(
            text = stringResource(MR.strings.auth_reg),
            style = MaterialTheme.typography.bodyLarge
        )
    }
}