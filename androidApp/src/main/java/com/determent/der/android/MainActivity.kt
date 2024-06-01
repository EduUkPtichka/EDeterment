package com.determent.der.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.defaultComponentContext
import com.determent.der.core_decompose.DefaultRootComponent
import com.determent.der.home.primary_slide_banner.ui_cmp.background_content.PrimaryBackgroundContentPNG
import dev.icerock.moko.resources.compose.colorResource
import dev.icerock.moko.resources.compose.painterResource
import org.example.library.MR

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        val root = DefaultRootComponent(componentContext = defaultComponentContext())

        setContent {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(colorResource(MR.colors.white)),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                PrimaryBackgroundContentPNG(imagePng = painterResource(MR.images.png_mountains)) {

                }
            }

            //ScreenRootContent(component = root, modifier = Modifier.fillMaxSize())
        }
    }
}

