package com.frogobox.recycler.core

import android.view.View
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding

/*
 * Created by Faisal Amir
 * =========================================
 * FrogoRecyclerViewAdapter
 * Copyright (C) 14/04/2020.      
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * FrogoBox Inc
 * com.frogobox.recycler.callback
 * 
 */
interface IFrogoBindingHolder<T, VB: ViewBinding> {

    // Setup Init Component on ViewHolder
    fun setupInitComponent(view: VB, data: T)

    // Setup View Binding
    fun setViewBinding(parent: ViewGroup) : VB

}