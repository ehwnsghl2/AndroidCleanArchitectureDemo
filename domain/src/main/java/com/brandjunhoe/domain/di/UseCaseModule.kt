package com.brandjunhoe.domain.di

import com.brandjunhoe.domain.repository.ReposRepository
import com.brandjunhoe.domain.usecase.repos.ReposUseCaseImpl
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class UseCaseModule {

    @Provides
    fun provideReposUseCase(
        @Named("ReposRepositoryImpl") reposRepository: ReposRepository
    ): ReposUseCaseImpl {
        return ReposUseCaseImpl(reposRepository)
    }

}