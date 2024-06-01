package preview.primary_slide_banner

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.determent.der.home.primary_slide_banner.ui_cmp.PrimaryBonusCard
import com.determent.der.home.primary_slide_banner.ui_cmp.background_content.PrimaryBackgroundContentPNG
import com.determent.der.reg.reg_main.ui_cmp.stateManager.horizontalPaddingDp32
import dev.chrisbanes.haze.HazeState
import dev.icerock.moko.resources.compose.painterResource
import org.example.library.MR

@Preview
@Composable
fun PreviewBonus_BackgroundPNG() {

    val hazeState = remember { HazeState() }

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        PrimaryBackgroundContentPNG(
            imagePng = painterResource(MR.images.png_mountains),
            hazeState = hazeState,
        ) {
            PrimaryBonusCard(
                hazeStateChild = hazeState,
                modifier = Modifier
                    .padding(horizontal = horizontalPaddingDp32)
            )
        }

    }
}