package com.srivatsa.recyclerview_animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.srivatsa.recyclerview_animation.CustomZoomClass.CustomZoomLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toursRV=findViewById<RecyclerView>(R.id.tourRV)




    }
}
