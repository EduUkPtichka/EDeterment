package preview.reg_main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.determent.der.reg.reg_main.ui_cmp.reg_textfield.RegPhoneNumber
import dev.icerock.moko.resources.compose.colorResource
import org.example.library.MR

@Preview
@Composable
private fun PreviewRegPhoneNumber() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(MR.colors.white)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        RegPhoneNumber(text = "+996 501 226 567", onChange = {})
    }

}