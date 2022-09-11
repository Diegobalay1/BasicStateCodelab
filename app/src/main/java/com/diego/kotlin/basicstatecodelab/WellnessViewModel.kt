package com.diego.kotlin.basicstatecodelab

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel

class WellnessViewModel : ViewModel() {
    private val _tasks = getWellnewssTasks().toMutableStateList()
    val tasks: List<WellnessTask>
        get() = _tasks

    fun remove(item: WellnessTask) {
        _tasks.remove(item)
    }

    fun changeTaskChecked(itemTask: WellnessTask, checked: Boolean) =
        tasks.find { it.id == itemTask.id }?.let { tsk ->
            tsk.checked = checked
        }
}

private fun getWellnewssTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }

