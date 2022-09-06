package com.diego.kotlin.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.diego.kotlin.basicstatecodelab.ui.theme.BasicStateCodelabTheme

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {

    Column(modifier = modifier.padding(16.dp)) {
        // Changes to count are now tracked by Compose
        //val count: MutableState<Int> = mutableStateOf(0)
        //val count: MutableState<Int> = remember { mutableStateOf(0) }
        var count by remember { mutableStateOf(0) }

        if (count > 0) {
            Text(
                text = "You've had $count glasses.",
            )
        }
        Button(
            onClick = { count++ },
            Modifier.padding(top = 8.dp),
            enabled = count < 10) {
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