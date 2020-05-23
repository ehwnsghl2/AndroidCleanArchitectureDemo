package com.brandjunhoe.base

import android.os.Bundle
import androidx.databinding.DataBindingUtil.setContentView
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

abstract class BaseActivity<B : ViewDataBinding, V : BaseViewModel> : DaggerAppCompatActivity() {

    @Inject
    lateinit var factory: ViewModelProvider.Factory

    abstract val layoutResource: Int
    private lateinit var viewDataBinding: B
    abstract val viewModel: V
    abstract val bindingVariable: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        performDataBinding()
    }

//    fun createFactory(): ViewModelProvider.Factory {
//        return factory
//    }

    private fun performDataBinding() {
        viewDataBinding = setContentView(this, layoutResource)
        viewDataBinding.apply {
            setVariable(bindingVariable, viewModel)
            lifecycleOwner = this@BaseActivity
            executePendingBindings()
        }
    }

}