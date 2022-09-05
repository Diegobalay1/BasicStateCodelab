package com.diego.kotlin.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.diego.kotlin.basicstatecodelab.ui.theme.BasicStateCodelabTheme

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    var count = 0
    Column(modifier = modifier.padding(16.dp)) {
        Text(
            text = "You've had $count glasses.",
        )
        Button(
            onClick = { count++ },
            Modifier.padding(top = 8.dp)) {
                Text("Add one")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WaterCounterPreview() {
    BasicStateCodelabTheme {
        WaterCounter()
    }
}