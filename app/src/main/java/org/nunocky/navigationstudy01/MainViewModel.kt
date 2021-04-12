package org.nunocky.navigationstudy01

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val quitButtonVisible = MutableLiveData(false)
}