package com.example.kotlin1

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.google.firebase.analytics.FirebaseAnalytics

import com.example.kotlin1.R.attr.colorButtonNormal
import com.example.kotlin1.R.attr.titleMargin
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private var mFirebaseAnalytics:FirebaseAnalytics?=null

    val rowN = 30
    val butN = 30
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        devbuttins()
        mFirebaseAnalytics= FirebaseAnalytics.getInstance(this)
    }

    fun devbuttins(){
        for (i in 0..rowN){
            val tableRaw = TableRow(this)
//            tableRaw.layoutParams = TableRow.LayoutParams(
//                    TableRow.LayoutParams.WRAP_CONTENT,
//                    TableRow.LayoutParams.WRAP_CONTENT
//            )
            var params = TableRow.LayoutParams()
            params.setMargins(0,1,1,1)
            table.addView(tableRaw,params)
            for (j in 0..butN){
                var linearLayoyt = LinearLayout (this)
                var params = TableRow.LayoutParams()
                params.width = 75
                params.height = 75
                params.setMargins(0,0,0,0)
                var button = Button (this)
                button.layoutParams =
                        LinearLayout.LayoutParams(
                                LinearLayout.LayoutParams.MATCH_PARENT,

                                LinearLayout.LayoutParams.MATCH_PARENT,
                                1F)
//                var paramsB = TableRow.LayoutParams()
//                params.width = match
//                params.height = 75



                //button.setOnClickListener {  ->  }
                button.text = "$i $j"
                if (i==rowN-5 && j==butN-5){
                    button.isFocusableInTouchMode = true
                    button.requestFocus()
                                    }
                linearLayoyt.addView(button)
                tableRaw.addView(linearLayoyt,params)


            }
        }
    }


}


