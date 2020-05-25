package com.brandjunhoe.local.mapper

import com.brandjunhoe.local.model.ReposEntity
import javax.inject.Inject


open class ReposEntityMapper @Inject constructor() : EntiryMapper<List<ReposEntity>, List<com.brandjunhoe.data.model.ReposEntity>> {

    override fun mapFromLocal(type: List<ReposEntity>): List<com.brandjunhoe.data.model.ReposEntity> {
        return type.map { com.brandjunhoe.data.model.ReposEntity(name = it.name, description =it.description) }
    }

    override fun mapToLocal(type: List<com.brandjunhoe.data.model.ReposEntity>): List<ReposEntity> {
        return type.map{ ReposEntity(name = it.name, description = it.description) }
    }


}


