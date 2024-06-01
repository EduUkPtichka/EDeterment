package com.determent.der.reg.reg_main.ui_cmp.reg_textfield

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.determent.der.reg.reg_main.ui_cmp.stateManager.roundedDp18
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
            .clip(RoundedCornerShape(roundedDp18))
            .border(1.dp, colorResource(MR.colors.gray_1), RoundedCornerShape(roundedDp18))
            .background(colorResource(MR.colors.white))
        ,
        textStyle = MaterialTheme.typography.titleMedium,
        shape = RoundedCornerShape(roundedDp18),
        leadingIcon = {
            PhoneNumberLeadingIcon()
        },
    )
}

@Composable
private fun PhoneNumberLeadingIcon() {
    Image(
        painter = painterResource(MR.images.png_flag_kyrgyzstan),
        contentDescription = null,
        modifier = Modifier
            .padding(start = 6.dp)
            .height(22.dp)
            .width(36.dp)
            .clip(RoundedCornerShape(16.dp)),
        contentScale = ContentScale.Crop
    )
}
