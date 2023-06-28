package com.talon.learncode.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

/**
 * @Description:
 * @author: talon
 * @date: 2023年05月17日 14:30
 */

abstract class BaseMVVMFragment<T : ViewDataBinding>(@LayoutRes val layoutId: Int) :
    Fragment(layoutId) {

    private var _binding: T? = null
    protected val binding get() = _binding!!

    private fun <T : ViewDataBinding> binding(
        inflater: LayoutInflater, @LayoutRes layoutId: Int, container: ViewGroup?
    ): T = DataBindingUtil.inflate<T>(inflater, layoutId, container, false)
        .apply { lifecycleOwner = this@BaseMVVMFragment }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        _binding = binding(inflater, layoutId, container)
        return binding.root;
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        startObserve()
        initView()
        initData()
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    abstract fun initView()
    abstract fun initData()
    abstract fun startObserve()
}