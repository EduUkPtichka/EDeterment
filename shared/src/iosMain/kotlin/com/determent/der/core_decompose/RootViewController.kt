package com.determent.der.core_decompose

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIViewController

fun rootViewController(root: RootComponent): UIViewController =
    ComposeUIViewController {
        ScreenRootContent(
            component = root,
            modifier = Modifier.fillMaxSize()
        )
    }