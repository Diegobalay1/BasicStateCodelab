package com.diego.kotlin.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    //WaterCounter(modifier)
    //StatefulCounter(modifier)
    Column(modifier = modifier) {
        StatefulCounter()
        WellnessTasksList()
    }
}