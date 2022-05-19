package com.yash1307.manualdi.parent

import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [ParentModule::class])
interface ParentComponent {

    fun providesParents(): ParentInterface
}