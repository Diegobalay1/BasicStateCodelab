package com.diego.kotlin.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    //WaterCounter(modifier)
    //StatefulCounter(modifier)
    Column(modifier = modifier) {
        StatefulCounter()

        /*val list = remember { getWellnewssTasks().toMutableStateList() }
        WellnessTasksList(list = list, onCloseTask = { task -> list.remove(task) })*/
        WellnessTasksListLevel()
    }
}

private fun getWellnewssTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }

@Composable
private fun WellnessTasksListLevel(modifier: Modifier = Modifier) {
    val list = remember { getWellnewssTasks().toMutableStateList() }
    WellnessTasksList(list = list, onCloseTask = { task -> list.remove(task) })
}