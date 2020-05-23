package com.brandjunhoe.domain.repository

import com.brandjunhoe.domain.model.Repos
import io.reactivex.Completable
import io.reactivex.Single

interface ReposRepository {
    fun getRepos(username: String): Single<List<Repos>>
    //fun insert(repos: List<Repos>): Completable
}