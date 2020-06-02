package com.brandjunhoe.presentation.mapper

import com.brandjunhoe.domain.model.Repos
import com.brandjunhoe.presentation.model.ReposView
import javax.inject.Inject

open class ReposMapper @Inject constructor(): Mapper<List<ReposView>, List<Repos>> {
    override fun mapToView(type: List<Repos>): List<ReposView> {
        return type.map { ReposView(it.name, it.description) }
    }
}
