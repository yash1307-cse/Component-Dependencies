package com.yash1307.manualdi.child

import com.yash1307.manualdi.parent.ImplParentInterface
import com.yash1307.manualdi.parent.ParentInterface
import javax.inject.Inject

class Message @Inject constructor(
    private val childInterface: ChildInterface,
    private val parentInterface: ParentInterface
){
    fun message() {
        childInterface.getMsg()
        parentInterface.getMsg()
    }
}