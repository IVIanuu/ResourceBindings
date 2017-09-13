package com.ivianuu.resourcebindings.sample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ivianuu.resourcebindings.bindAnim
import com.ivianuu.resourcebindings.bindColor

class MainActivity : AppCompatActivity() {

    private val anim by bindAnim(R.anim.abc_fade_in)
    private val color by bindColor(R.color.colorPrimary)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
