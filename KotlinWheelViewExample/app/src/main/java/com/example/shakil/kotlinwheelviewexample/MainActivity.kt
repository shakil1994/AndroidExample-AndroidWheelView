package com.example.shakil.kotlinwheelviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import me.sujanpoudel.wheelview.WheelView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val wheelView = findViewById<WheelView>(R.id.wheel_view)
        wheelView.titles = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six")

        wheelView.selectListener = object : Function1<Int?, Unit> {
            override fun invoke(p1: Int?) {
                if (p1 != null) {
                    showToast(p1)
                }
            }

            private fun showToast(index: Int) {
                Toast.makeText(this@MainActivity, "" + wheelView.titles[index], Toast.LENGTH_SHORT).show()
            }

        }
    }
}
