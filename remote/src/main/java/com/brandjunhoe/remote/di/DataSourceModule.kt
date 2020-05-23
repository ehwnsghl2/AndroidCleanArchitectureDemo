package com.brandjunhoe.remote.di

import com.brandjunhoe.remote.ReposService
import com.brandjunhoe.data.mapper.ReposMapper
import com.brandjunhoe.data.repository.ReposRepositoryImpl
import com.brandjunhoe.data.source.repos.ReposRemoteDataSource
import com.brandjunhoe.remote.ReposRemoteDataSourceImpl
import com.brandjunhoe.remote.mapper.ReposEntityMapper
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class DataSourceModule {

    @Provides
    @Named("ReposRemoteDataSourceImpl")
    fun provideDataSurce(
        reposService: ReposService,
        entityMapper: ReposEntityMapper
    ): ReposRemoteDataSource {
        return ReposRemoteDataSourceImpl(reposService, entityMapper)
    }
}