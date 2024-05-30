package com.determent.der.reg.reg_main.ui_cmp

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.determent.der.reg.reg_main.decompose.RegMainComponent

@Composable
expect fun ScreenRegMain(
    component: RegMainComponent,
    modifier: Modifier = Modifier,
)

