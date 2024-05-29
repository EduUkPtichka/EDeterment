package com.determent.der.reg.ui_cmp.preview

import androidx.compose.ui.window.ComposeUIViewController
import com.determent.der.reg.ui_cmp.auth_textfield.RegPhoneNumber
import platform.UIKit.UIViewController

fun AuthPreviewIosPhoneNumber() : UIViewController =
    ComposeUIViewController {
        RegPhoneNumber(
            onChange = { }
        )
    }

