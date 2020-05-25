package com.brandjunhoe.local.source

import com.brandjunhoe.base.ext.networkThreadWithMainThread
import com.brandjunhoe.data.model.ReposEntity
import com.brandjunhoe.data.source.repos.ReposLocalDataSource
import com.brandjunhoe.local.dao.ReposDao
import com.brandjunhoe.local.mapper.ReposEntityMapper
import io.reactivex.Completable
import javax.inject.Inject


class ReposLocalDataSourceImpl @Inject constructor(
    private val reposDao: ReposDao,
    private val entityMapper: ReposEntityMapper
) : ReposLocalDataSource {

    override fun insertRepos(repos: List<ReposEntity>): Completable  {
       return reposDao.insertList(entityMapper.mapToLocal(repos)).networkThreadWithMainThread()
    }
}