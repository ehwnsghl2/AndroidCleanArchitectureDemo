package com.brandjunhoe.data.mapper

import com.brandjunhoe.data.model.ReposEntity
import com.brandjunhoe.domain.model.Repos
import javax.inject.Inject

open class ReposMapper @Inject constructor() : Mapper<List<ReposEntity>, List<Repos>> {

    override fun mapFromEntity(type: List<ReposEntity>): List<Repos> {
        return type.map { Repos(it.name, it.description) }
    }


    override fun mapToEntity(type: List<Repos>): List<ReposEntity> {
        return type.map { ReposEntity(it.name, it.description) }
    }


}


