package com.brandjunhoe.domain.usecase.repos

import com.brandjunhoe.domain.model.Repos
import io.reactivex.Completable
import io.reactivex.Single


interface ReposUseCase {
    //fun insert(repos: List<Repos>): Completable
    fun getRepos(username: String): Single<List<Repos>>
}