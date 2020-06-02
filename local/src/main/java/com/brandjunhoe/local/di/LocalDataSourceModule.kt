package com.brandjunhoe.local.di

import com.brandjunhoe.data.source.repos.ReposLocalDataSource
import com.brandjunhoe.local.AppDatabase
import com.brandjunhoe.local.dao.ReposDao
import com.brandjunhoe.local.mapper.ReposEntityMapper
import com.brandjunhoe.local.source.ReposLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class LocalDataSourceModule {

    @Provides
    @Named("ReposLocalDataSourceImpl")
    fun provideLocalDataSource(
        entityMapper: ReposEntityMapper,
        appDatabase: AppDatabase
    ): ReposLocalDataSource {
        return ReposLocalDataSourceImpl(appDatabase, entityMapper)
    }

}