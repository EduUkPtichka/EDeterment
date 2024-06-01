@file:Suppress("UNUSED_EXPRESSION")

package com.determent.der.reg.reg_main.ui_cmp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arkivanov.decompose.extensions.compose.subscribeAsState
import com.determent.der.reg.reg_main.decompose.RegMainComponent
import com.determent.der.reg.reg_main.ui_cmp.reg_textfield.RegPhoneNumber
import com.determent.der.reg.reg_main.ui_cmp.stateManager.horizontalPaddingDp32
import dev.icerock.moko.resources.compose.stringResource
import org.example.library.MR

@Composable
actual fun ScreenRegMain(
    component: RegMainComponent,
    modifier: Modifier
) {

    val model by component.models.subscribeAsState()

    val items = remember {
        listOf("Почта", "Телефон")
    }

    var selectedIndex by remember {
        mutableIntStateOf(0)
    }

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

        Spacer(
            modifier = Modifier
                .height(30.dp)
                .fillMaxWidth()
        )



        RegSwitchButton(
            items = items,
            selectedIndex = selectedIndex,
            onClick = { index ->
                selectedIndex = index
            },
            modifier = Modifier
                .padding(horizontal = horizontalPaddingDp32)
        )

        Spacer(
            modifier = Modifier
                .height(22.dp)
                .fillMaxWidth()
        )

        RegPhoneNumber(
            text = model.phoneNumber,
            onChange = component::onChangedPhoneNumber,
            modifier = Modifier
                .height(58.dp)
                .fillMaxWidth()
                .padding(horizontal = horizontalPaddingDp32)
        )

        Spacer(
            modifier = Modifier
                .height(16.dp)
                .fillMaxWidth()
        )

        RegButton(
            modifier = Modifier
                .padding(horizontal = horizontalPaddingDp32),
            onClick = component::onClickReg,
        )
    }
}