package com.brandjunhoe.remote.mapper

import com.brandjunhoe.data.model.ReposEntity
import com.brandjunhoe.remote.model.ReposModel
import javax.inject.Inject

open class ReposEntityMapper @Inject constructor() : EntiryMapper<List<ReposModel>, List<ReposEntity>> {

    override fun mapFromRemote(type: List<ReposModel>): List<ReposEntity> {
        return type.map { ReposEntity(it.name, it.description) }
    }

}
