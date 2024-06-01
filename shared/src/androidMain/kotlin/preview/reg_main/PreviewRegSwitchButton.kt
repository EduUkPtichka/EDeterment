package preview.reg_main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.determent.der.reg.reg_main.ui_cmp.RegSwitchButton
import dev.icerock.moko.resources.compose.colorResource
import org.example.library.MR

@Preview
@Composable
fun PreviewRegSwitchButton() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(MR.colors.white)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        val items = remember {
            listOf("Почта", "Телефон")
        }

        var selectedIndex by remember {
            mutableIntStateOf(0)
        }

        RegSwitchButton(
            items = items,
            selectedIndex = selectedIndex,
            onClick = { index ->
                selectedIndex = index
            }
        )
    }
}

