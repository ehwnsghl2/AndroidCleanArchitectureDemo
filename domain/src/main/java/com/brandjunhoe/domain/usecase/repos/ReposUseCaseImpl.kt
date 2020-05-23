package com.brandjunhoe.domain.usecase.repos

import com.brandjunhoe.domain.model.Repos
import com.brandjunhoe.domain.repository.ReposRepository
import io.reactivex.Completable
import io.reactivex.Single
import javax.inject.Inject

class ReposUseCaseImpl @Inject constructor(private val repository: ReposRepository) :
    ReposUseCase {

    /*override fun insert(repos: List<Repos>): Completable {
        return repository.insert(repos)
    }*/

    override fun getRepos(username: String): Single<List<Repos>> {
        return repository.getRepos(username)
    }


}