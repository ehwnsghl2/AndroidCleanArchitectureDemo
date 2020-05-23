package com.brandjunhoe.architecture

import com.brandjunhoe.architecture.di.component.DaggerReposComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class ReposApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerReposComponent.factory().create(this)
    }
}