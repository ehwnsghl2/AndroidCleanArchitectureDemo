package com.brandjunhoe.presentation.repos

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.brandjunhoe.base.BaseViewModel
import com.brandjunhoe.domain.model.Repos
import com.brandjunhoe.domain.usecase.repos.ReposUseCaseImpl
import com.brandjunhoe.presentation.mapper.ReposMapper
import com.brandjunhoe.presentation.model.ReposView
import javax.inject.Inject

class ReposViewModel @Inject constructor(private val reposUseCaseImpl: ReposUseCaseImpl, private val reposMapper: ReposMapper) :
    BaseViewModel() {

    private val _repos = MutableLiveData<MutableList<ReposView>>()
    val repos: LiveData<MutableList<ReposView>> get() = _repos

    init {
        getRepos("ehwnsghl2")
    }


    private fun getRepos(username: String) {
        addDisposable(reposUseCaseImpl.getRepos(username).subscribe({
            _repos.value = reposMapper.mapToView(it) as MutableList<ReposView>
                Log.d("확인", "repos ${it}")
            //_repos.value = reposMapper.mapToView(it) as MutableList<ReposView>
        }, {
            Log.d("확인", "error ${it.message}")
            //_error.value = it.message
        }))
    }

}
