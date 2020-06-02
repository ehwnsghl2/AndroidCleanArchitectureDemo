package com.brandjunhoe.presentation.di.module

import com.brandjunhoe.presentation.mapper.ReposMapper
import dagger.Module
import dagger.Provides

@Module
class ReposViewMapper {

    @Provides
    fun provideMapper(): ReposMapper {
        return ReposMapper()
    }
}