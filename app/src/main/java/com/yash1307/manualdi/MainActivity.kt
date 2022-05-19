package com.yash1307.manualdi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yash1307.manualdi.child.DaggerChildComponent
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var message: com.yash1307.manualdi.child.Message
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val parentComponent = (application as BaseApplication).parentComponent

        val component = DaggerChildComponent.factory().create("Hello", parentComponent)
        component.inject(this)

        message.message()


    }
}