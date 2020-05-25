package com.brandjunhoe.data.repository

import com.brandjunhoe.base.ext.networkThreadWithMainThread
import com.brandjunhoe.data.mapper.ReposMapper
import com.brandjunhoe.data.model.ReposEntity
import com.brandjunhoe.data.source.repos.ReposLocalDataSource
import com.brandjunhoe.data.source.repos.ReposRemoteDataSource
import com.brandjunhoe.domain.model.Repos
import com.brandjunhoe.domain.repository.ReposRepository
import io.reactivex.Completable
import io.reactivex.Single
import javax.inject.Inject

open class ReposRepositoryImpl @Inject constructor(
    private val localDataSource: ReposLocalDataSource,
    private val remoteDataSource: ReposRemoteDataSource,
    private val mapper: ReposMapper
) :
    ReposRepository {

    override fun getRepos(username: String): Single<List<Repos>> {
        return remoteDataSource.getRepos(username).networkThreadWithMainThread().map(mapper::mapFromEntity)
    }

    override fun insert(repos: List<Repos>): Completable {
        return localDataSource.insertRepos(mapper.mapToEntity(repos)).networkThreadWithMainThread()
    }

}