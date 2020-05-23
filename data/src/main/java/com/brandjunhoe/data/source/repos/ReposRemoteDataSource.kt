package com.brandjunhoe.data.source.repos

import com.brandjunhoe.data.model.ReposEntity
import com.brandjunhoe.data.source.BaseDataSource
import com.brandjunhoe.domain.model.Repos
import io.reactivex.Single

interface ReposRemoteDataSource : BaseDataSource {
    fun getRepos(username: String) : Single<List<ReposEntity>>
}
