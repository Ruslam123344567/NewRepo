package com.example.anew

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.kadr.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onclik1 (view :View) {
        var intenT = Intent(this, Kadr::class.java)
        startActivity(intenT)

    }
    fun onclik2(view :View){
        var intenT = Intent(this, Tw::class.java)
        startActivity(intenT)

    }
}
class kadr : AppCompatActivity() {
    lateinit var anim: AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kadr)
        (f.background as AnimationDrawable).start()

    }
}
class tw : AppCompatActivity() {
    lateinit var anim: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tw)

        button3.setOnClickListener {
            anim = AnimationUtils.loadAnimation(this, R.anim.exp)
            button3.startAnimation(anim)

        }

    }
}
