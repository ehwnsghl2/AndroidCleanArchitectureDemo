package com.brandjunhoe.data.source.repos

import com.brandjunhoe.data.model.ReposEntity
import com.brandjunhoe.data.source.BaseDataSource
import io.reactivex.Completable
import io.reactivex.Single

interface ReposLocalDataSource : BaseDataSource {

    fun insertRepos(repos: List<ReposEntity>) : Completable
    fun getRepos(username: String) : Single<List<ReposEntity>>

}