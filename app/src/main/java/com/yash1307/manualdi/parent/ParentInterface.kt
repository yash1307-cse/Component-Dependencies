package com.yash1307.manualdi.parent

import android.util.Log

interface ParentInterface {
    fun getMsg()
}

class ImplParentInterface : ParentInterface {
    override fun getMsg() {
        Log.d("Message", "getMsg: How are you?")
    }
}