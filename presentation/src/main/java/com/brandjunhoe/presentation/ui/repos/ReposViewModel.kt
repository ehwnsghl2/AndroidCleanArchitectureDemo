package com.brandjunhoe.presentation.ui.repos

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.brandjunhoe.base.BaseViewModel
import com.brandjunhoe.domain.model.Repos
import com.brandjunhoe.domain.usecase.repos.ReposUseCaseImpl
import io.reactivex.rxkotlin.addTo
import javax.inject.Inject

class ReposViewModel @Inject constructor(private val reposUseCaseImpl: ReposUseCaseImpl) :
    BaseViewModel() {

    private val _repos = MutableLiveData<MutableList<Repos>>()
    val repos: LiveData<MutableList<Repos>> get() = _repos

    init {
        getRepos("ehwnsghl2")
    }


    private fun getRepos(username: String) {
        addDisposable(reposUseCaseImpl.getRepos(username).subscribe({
            _repos.value = it as MutableList<Repos>?
        }, {
            Log.d("확인", "error ${it.message}")
            //_error.value = it.message
        }))
    }

}
