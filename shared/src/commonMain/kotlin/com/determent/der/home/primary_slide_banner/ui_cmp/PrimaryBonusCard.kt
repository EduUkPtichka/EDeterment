package com.determent.der.home.primary_slide_banner.ui_cmp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.FixedScale
import androidx.compose.ui.unit.dp
import dev.chrisbanes.haze.HazeState
import dev.chrisbanes.haze.HazeStyle
import dev.chrisbanes.haze.haze
import dev.chrisbanes.haze.hazeChild
import dev.icerock.moko.resources.compose.colorResource
import dev.icerock.moko.resources.compose.painterResource
import org.example.library.MR

/**
 * Android API 31 and higher
 */
@Composable
fun PrimaryBonusCard(
    hazeStateChild: HazeState,
    modifier: Modifier = Modifier
) {

    Card(
        modifier = modifier
            .height(200.dp)
            .fillMaxWidth()
            .hazeChild(
                state = hazeStateChild,
                shape = RoundedCornerShape(22.dp)
            ),
        shape = RoundedCornerShape(22.dp),
        backgroundColor = Color.Unspecified,
    ) {

        Box {
            Image(
                painter = painterResource(MR.images.svg_tunduk),
                contentDescription = null,
                modifier = Modifier
                    .size(100.dp)
                    .wrapContentSize(align = Alignment.BottomEnd, unbounded = true)
                    .align(Alignment.BottomEnd)
                    .offset(y = 26.dp, x = 24.dp),
                colorFilter = ColorFilter.tint(Color.White.copy(alpha = 0.2f)),
                contentScale = FixedScale(1f)
            )
        }

    }
}