package org.nunocky.navigationstudy01

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class A02ViewModel : ViewModel() {
    private val _count = MutableLiveData(0)
    val count: LiveData<Int> = _count

    fun setCount(count: Int) {
        _count.value = count
    }

    fun increment() {
        _count.value = _count.value?.plus(1)
    }

    fun decrement() {
        if (0 < _count.value!!) {
            _count.value = _count.value?.minus(1)
        }
    }
}