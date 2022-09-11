package com.diego.kotlin.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    wellnessViewModel: WellnessViewModel = viewModel()
) {
    //WaterCounter(modifier)
    //StatefulCounter(modifier)
    Column(modifier = modifier) {
        StatefulCounter()

        /*val list = remember { getWellnewssTasks().toMutableStateList() }
        WellnessTasksList(list = list, onCloseTask = { task -> list.remove(task) })*/
        //WellnessTasksListLevel()

        WellnessTasksList(
            list = wellnessViewModel.tasks,
            onCheckedTask = { task, checked ->
                wellnessViewModel.changeTaskChecked(task, checked)
            },
            onCloseTask = { task ->
                wellnessViewModel.remove(task)
            }
        )
    }
}

//private fun getWellnewssTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }

/*@Composable
private fun WellnessTasksListLevel(modifier: Modifier = Modifier) {
    val list = remember { getWellnewssTasks().toMutableStateList() }
    WellnessTasksList(list = list, onCloseTask = { task -> list.remove(task) })
}*/