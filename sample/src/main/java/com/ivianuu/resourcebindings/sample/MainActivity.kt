package com.ivianuu.resourcebindings.sample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.ivianuu.resourcebindings.bindAnim
import com.ivianuu.resourcebindings.bindColor
import com.ivianuu.resourcebindings.bindDrawable

class MainActivity : AppCompatActivity() {

    private val anim by bindAnim(R.anim.abc_fade_in)
    private val color by bindColor(R.color.colorPrimary)
    private val drawable by bindDrawable(R.drawable.test)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = TextView(this)
        text.background = drawable
        text.setTextColor(color)
        text.startAnimation(anim)
    }
}
