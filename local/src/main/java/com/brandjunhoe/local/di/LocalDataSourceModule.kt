package com.brandjunhoe.local.di

import android.content.Context
import com.brandjunhoe.data.source.repos.ReposLocalDataSource
import com.brandjunhoe.local.AppDB
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
        context: Context
    ): ReposLocalDataSource {
        return ReposLocalDataSourceImpl(AppDB.getInstance(context).getRepos(), entityMapper)
    }

}