package com.superbeta.water

import android.animation.Animator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import androidx.drawerlayout.widget.DrawerLayout
import com.airbnb.lottie.LottieAnimationView
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bubbleAnim = findViewById<LottieAnimationView>(R.id.lottieAnimationView)
        val btAddWater = findViewById<MaterialButton>(R.id.btAddWater)
        val btSettings = findViewById<MaterialButton>(R.id.btSettings)
        val drawerLayout = findViewById<DrawerLayout>(R.id.drawerLayout)

        btAddWater.setOnClickListener {
            bubbleAnim.visibility = View.VISIBLE
            bubbleAnim.playAnimation()
            bubbleAnim.addAnimatorListener(object : Animator.AnimatorListener {

                override fun onAnimationStart(p0: Animator) {
                }

                override fun onAnimationEnd(p0: Animator) {
                    bubbleAnim.visibility = View.GONE
                }

                override fun onAnimationCancel(p0: Animator) {
                }

                override fun onAnimationRepeat(p0: Animator) {
                }

            })


        }

        btSettings.setOnClickListener {
            drawerLayout.openDrawer(Gravity.RIGHT)
        }

    }
}