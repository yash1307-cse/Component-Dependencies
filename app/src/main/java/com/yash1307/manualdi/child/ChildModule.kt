package com.yash1307.manualdi.child

import com.yash1307.manualdi.ActivityScoped
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class ChildModule {

    @ActivityScoped
    @Provides
    fun sendMsg(msg:String): ChildInterface {
        return ImplChildInterface(msg)
    }
}