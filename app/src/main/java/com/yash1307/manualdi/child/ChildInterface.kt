package com.yash1307.manualdi.child

import android.util.Log


interface ChildInterface {
    fun getMsg()
}

class ImplChildInterface(val msg:String) : ChildInterface {
    override fun getMsg() {
        Log.d("Message", "getMsg: $msg")
    }

}