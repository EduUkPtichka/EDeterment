package com.determent.der.reg.reg_main.ui_cmp.reg_textfield

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.determent.der.reg.reg_main.ui_cmp.stateManager.roundedDp22
import dev.icerock.moko.resources.compose.colorResource
import dev.icerock.moko.resources.compose.painterResource
import org.example.library.MR

@Composable
fun RegPhoneNumber(
    text: String,
    onChange: (String) -> Unit,
    modifier: Modifier = Modifier,
) {

    OutlinedTextField(
        value = text,
        onValueChange = onChange,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
        modifier = modifier
            .clip(RoundedCornerShape(roundedDp22))
            .border(2.dp, colorResource(MR.colors.gray_1), RoundedCornerShape(roundedDp22))
            .background(colorResource(MR.colors.white)),
        leadingIcon = {
            PhoneNumberLeadingIcon()
        },
    )
}


@Composable
private fun PhoneNumberLeadingIcon() {
    Icon(
        painter = painterResource(MR.images.png_flag_kyrgyzstan),
        contentDescription = null,
        modifier = Modifier
            .padding(start = 4.dp)
            .size(34.dp),
        tint = Color.Unspecified,
    )
}
