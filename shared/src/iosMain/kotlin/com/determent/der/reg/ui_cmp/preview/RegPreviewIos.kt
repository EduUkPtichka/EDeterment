package com.determent.der.reg.ui_cmp.preview

import androidx.compose.ui.window.ComposeUIViewController
import com.determent.der.reg.ui_cmp.reg_textfield.RegPhoneNumber
import platform.UIKit.UIViewController

fun RegPreviewIosPhoneNumber() : UIViewController =
    ComposeUIViewController {
        RegPhoneNumber(
            onChange = { }
        )
    }

