package com.brandjunhoe.architecture.di.component

import android.content.Context
import com.brandjunhoe.architecture.ReposApplication
import com.brandjunhoe.data.di.RepositoryModule
import com.brandjunhoe.domain.di.UseCaseModule
import com.brandjunhoe.local.di.DatabaseModule
import com.brandjunhoe.local.di.LocalDataSourceModule
import com.brandjunhoe.presentation.di.module.ActivityBindingModule
import com.brandjunhoe.remote.di.RemoteDataSourceModule
import com.brandjunhoe.remote.di.NetworkModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ActivityBindingModule::class,
        RemoteDataSourceModule::class,
        LocalDataSourceModule::class,
        RepositoryModule::class,
        UseCaseModule::class,
        NetworkModule::class,
        DatabaseModule::class]
)
interface ReposComponent : AndroidInjector<ReposApplication> {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): ReposComponent
    }
}