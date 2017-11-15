package com.example.kotlin1

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.Toast
import com.example.kotlin1.R.attr.colorButtonNormal
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    val rowN = 15
    val butN = 15
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        devbuttins()
    }

    fun devbuttins(){
        for (i in 0..rowN){
            val tableRaw = TableRow (this)
            table.addView(tableRaw)
            for (j in 0..butN){
                val button = Button (this)
                tableRaw.addView(button)
                button.text = "$i $j"
                if (i==rowN-5 && j==butN-5){
                    button.setFocusableInTouchMode(true)
                    button.requestFocus()


                }

            }
        }
    }


}


