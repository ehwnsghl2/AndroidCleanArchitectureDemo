package com.brandjunhoe.remote

import com.brandjunhoe.base.ext.networkThreadWithMainThread
import com.brandjunhoe.data.model.ReposEntity
import com.brandjunhoe.data.source.repos.ReposRemoteDataSource
import com.brandjunhoe.remote.mapper.ReposEntityMapper
import io.reactivex.Single
import javax.inject.Inject

class ReposRemoteDataSourceImpl @Inject constructor(
    private val reposService: ReposService,
    private val entityMapper: ReposEntityMapper) :
    ReposRemoteDataSource {

    override fun getRepos(username: String): Single<List<ReposEntity>> {
        return reposService.repos(username).map(entityMapper::mapFromRemote)
    }

}