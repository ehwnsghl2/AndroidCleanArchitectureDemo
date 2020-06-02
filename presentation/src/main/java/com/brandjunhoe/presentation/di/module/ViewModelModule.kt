package com.brandjunhoe.presentation.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.brandjunhoe.presentation.di.ViewModelFactory
import com.brandjunhoe.presentation.di.qualifer.ViewModelKey
import com.brandjunhoe.presentation.repos.ReposViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(ReposViewModel::class)
    abstract fun bindReposViewModel(viewModel: ReposViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(
        factory: ViewModelFactory
    ): ViewModelProvider.Factory

}