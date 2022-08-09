package com.letspracticeskills.ahmedezzulddin.exampledaggerhiltyt

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    secondName: String
): ViewModel() {

    val TAG = "MainViewModelDaggerHilt"

    init {
        Log.d(TAG, "second name: $secondName")
    }
}