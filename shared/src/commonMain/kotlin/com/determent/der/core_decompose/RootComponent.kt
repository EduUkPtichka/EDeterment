package com.determent.der.core_decompose

import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value
import com.determent.der.reg.reg_main.decompose.RegMainComponent

interface RootComponent {

    val stack: Value<ChildStack<*, Child>>

    fun onBackClicked(toIndex: Int)

    sealed class Child {
        class ChildRegMain(val component: RegMainComponent) : Child()
    }
}