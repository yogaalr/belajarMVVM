package com.chirikualii.materiapi.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.chirikualii.materiapi.data.Repository.MovieRepoImpl
import com.chirikualii.materiapi.data.remote.ApiClient

class MainViewModelFactory :ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val viewModel = MainViewModel(
            MovieRepoImpl(ApiClient.service)
        )as T

        return viewModel
    }
}