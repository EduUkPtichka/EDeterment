package com.determent.der.reg.reg_main.ui_cmp.reg_textfield

import androidx.compose.runtime.Composable

@Composable
internal fun RegTextFieldStrategy(
    component1: @Composable () -> Unit,
    component2: @Composable () -> Unit,
    selectedIndex: Int,
) {
    if (selectedIndex == 0) {
        component1()
    } else {
        component2()
    }

}