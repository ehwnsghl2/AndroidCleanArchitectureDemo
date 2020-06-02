package com.brandjunhoe.architecture.di.module

import com.brandjunhoe.architecture.ui.repos.ReposActivity
import com.brandjunhoe.presentation.di.module.ViewModelModule
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules = [ViewModelModule::class])
    abstract fun bindReposActivity(): ReposActivity


}