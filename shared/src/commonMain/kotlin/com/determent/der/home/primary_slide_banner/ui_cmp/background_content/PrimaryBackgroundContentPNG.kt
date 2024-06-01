package com.determent.der.home.primary_slide_banner.ui_cmp.background_content

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp

@Composable
fun PrimaryBackgroundContentPNG(
    imagePng: Painter,
    content: @Composable () -> Unit,
) {
    Box(
        modifier = Modifier
            .height(500.dp)
            .fillMaxWidth()
        ,
        contentAlignment = Alignment.Center
    ) {

        Image(
            painter = imagePng,
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        content()

    }
}