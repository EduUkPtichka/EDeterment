package com.determent.der.reg.ui_cmp

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import dev.icerock.moko.resources.compose.colorResource
import org.example.library.MR

@Composable
fun RegSwitchButton(
    items: List<String>,
    selectedIndex: Int,
    onClick: (Int) -> Unit,
) {

    Row(
        modifier = Modifier
            .clip(RoundedCornerShape(22.dp))
            .border(2.dp, colorResource(MR.colors.gray_1), RoundedCornerShape(22.dp))
            .height(60.dp)
            .fillMaxWidth()
            .background(colorResource(MR.colors.white)),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        items.forEachIndexed { index, items ->

            val isSelected: Boolean = selectedIndex == index

            TextButton(
                onClick = { onClick(index) },
                modifier = Modifier
                    .padding(4.dp)
                    .clip(RoundedCornerShape(22.dp))
                    .fillMaxHeight()
                    .weight(1f)
                    .then(
                        if (isSelected) Modifier.background(colorResource(MR.colors.gray_1))
                        else Modifier.background(colorResource(MR.colors.white))
                    ),
                enabled = !isSelected
            ) {
                Text(
                    text = items
                )
            }
        }
    }
}