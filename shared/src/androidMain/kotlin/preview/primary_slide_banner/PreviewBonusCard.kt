package preview.primary_slide_banner

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.determent.der.home.primary_slide_banner.ui_cmp.PrimaryBonusCard
import com.determent.der.reg.reg_main.ui_cmp.stateManager.horizontalPaddingDp32

@Preview
@Composable
fun PreviewBonusCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        PrimaryBonusCard(
            modifier = Modifier
                .padding(horizontal = horizontalPaddingDp32)
        )
    }
}