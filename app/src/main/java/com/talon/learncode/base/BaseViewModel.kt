package com.talon.learncode.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * @Description:
 * @author: talon
 * @date: 2023年05月17日 13:16
 */

open class BaseViewModel : ViewModel() {
    open class UIState<T> {
        val isLoading: Boolean = false
        val isRefresh: Boolean = false
        val isSuccess: T? = null
        val isError: String? = null
    }

    open class BaseUIModel<T> {
        val showLoading: Boolean = false
        val isRefresh: Boolean = false
        val showEnd: Boolean = false;
        val showSuccess: T? = null
        val showError: String? = null
    }

    val mException: MutableLiveData<Throwable> = MutableLiveData()

    fun launchOnUI(block: suspend CoroutineScope.() -> Unit) {
        viewModelScope.launch { block() }
    }

    suspend fun <T> launchOnIO(block: suspend CoroutineScope.() -> T) {
        withContext(Dispatchers.IO) {
            block
        }
    }
}