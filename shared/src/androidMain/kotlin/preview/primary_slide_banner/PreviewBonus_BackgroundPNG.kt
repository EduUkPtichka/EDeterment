package preview.primary_slide_banner

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.determent.der.home.primary_slide_banner.ui_cmp.background_content.PrimaryBackgroundContentPNG
import dev.icerock.moko.resources.compose.colorResource
import dev.icerock.moko.resources.compose.painterResource
import org.example.library.MR

@Preview
@Composable
private fun PreviewBonus_BackgroundPNG() {
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
}