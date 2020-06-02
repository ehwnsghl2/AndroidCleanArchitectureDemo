package com.brandjunhoe.architecture.ui.repos

import com.brandjunhoe.architecture.R
import android.os.Bundle
import com.brandjunhoe.architecture.databinding.ActivityReposBinding
import com.brandjunhoe.base.BaseActivity
import com.brandjunhoe.base.ext.createViewModel
import com.brandjunhoe.architecture.BR
import com.brandjunhoe.presentation.repos.ReposViewModel


class ReposActivity : BaseActivity<ActivityReposBinding, ReposViewModel>() {

    override val layoutResource: Int = R.layout.activity_repos
    override val bindingVariable: Int = BR.vm
    override val viewModel: ReposViewModel by lazy {
        createViewModel(
            factory,
            ReposViewModel::class.java
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


}
