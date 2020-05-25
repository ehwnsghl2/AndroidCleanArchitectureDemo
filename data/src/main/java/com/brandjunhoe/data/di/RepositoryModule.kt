package com.brandjunhoe.data.di

import com.brandjunhoe.data.mapper.ReposMapper
import com.brandjunhoe.data.repository.ReposRepositoryImpl
import com.brandjunhoe.data.source.repos.ReposLocalDataSource
import com.brandjunhoe.data.source.repos.ReposRemoteDataSource
import com.brandjunhoe.domain.repository.ReposRepository
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class RepositoryModule {

    @Provides
    @Named("ReposRepositoryImpl")
    fun provideReposRepository(
        @Named("ReposLocalDataSourceImpl") localDataSource: ReposLocalDataSource,
        @Named("ReposRemoteDataSourceImpl") remoteDataSource: ReposRemoteDataSource,
        reposMapper: ReposMapper
    ): ReposRepository {
        return ReposRepositoryImpl(localDataSource, remoteDataSource, reposMapper)
    }

}