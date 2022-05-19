package com.yash1307.manualdi.child

import com.yash1307.manualdi.ActivityScoped
import com.yash1307.manualdi.MainActivity
import com.yash1307.manualdi.parent.ParentComponent
import dagger.BindsInstance
import dagger.Component


@ActivityScoped
@Component(dependencies = [ParentComponent::class], modules = [ChildModule::class])
interface ChildComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface ChildFactory {
        fun create(@BindsInstance msg: String, parentComponent: ParentComponent): ChildComponent
    }
}