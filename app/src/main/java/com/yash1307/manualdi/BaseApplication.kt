package com.yash1307.manualdi

import android.app.Application
import com.yash1307.manualdi.parent.DaggerParentComponent
import com.yash1307.manualdi.parent.ParentComponent

class BaseApplication : Application() {

    lateinit var parentComponent: ParentComponent
    override fun onCreate() {
        super.onCreate()

        parentComponent = DaggerParentComponent.builder().build()

    }
}