package com.example.kotlin1

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    protected fun onClic (view :View){
        val buttonclick = view as  Button
        var idB = 0
        when (buttonclick.id){
            R.id.button1 -> idB =1
            R.id.button2 -> idB =2
            R.id.button3 -> idB =3
            R.id.button4 -> idB =4
            R.id.button5 -> idB =5
            R.id.button6 -> idB =6
            R.id.button7 -> idB =7
            R.id.button8 -> idB =8
            R.id.button9 -> idB =9
        }
        //Toast.makeText(this,idB.toString(),Toast.LENGTH_LONG).show()
        Play(idB,buttonclick)
    }
    var player = 1
    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()
    var winer = 0


    fun Play (idB: Int,buttonclick: Button){

        if (player ==1 ){
            player1.add(idB)
            buttonclick.text="X"
            buttonclick.setBackgroundColor(Color.GREEN)
            player=2
        }else{
            player2.add(idB)
            buttonclick.text="O"
            buttonclick.setBackgroundColor(Color.BLUE)
            player=1

        }
        CheckWin()
    }

    fun CheckWin(){

        if(player1.contains(1)&&player1.contains(2)&&player1.contains(3)){
            winer=1
        }
        if(player2.contains(1)&&player2.contains(2)&&player2.contains(3)){
            winer=2
        }

        if(player1.contains(4)&&player1.contains(5)&&player1.contains(6)){
            winer=1
        }
        if(player2.contains(4)&&player2.contains(5)&&player2.contains(6)){
            winer=2
        }

        if(player1.contains(7)&&player1.contains(8)&&player1.contains(9)){
            winer=1
        }
        if(player2.contains(7)&&player2.contains(8)&&player2.contains(9)){
            winer=2
        }

        if(player1.contains(1)&&player1.contains(5)&&player1.contains(9)){
            winer=1
        }
        if(player2.contains(1)&&player2.contains(5)&&player2.contains(9)){
            winer=2
        }
        if(player1.contains(3)&&player1.contains(5)&&player1.contains(7)){
            winer=1
        }
        if(player2.contains(3)&&player2.contains(5)&&player2.contains(7)){
            winer=2
        }
        if(player1.contains(3)&&player1.contains(6)&&player1.contains(9)){
            winer=1
        }
        if(player2.contains(3)&&player2.contains(6)&&player2.contains(9)){
            winer=2
        }
        if(player1.contains(2)&&player1.contains(5)&&player1.contains(8)){
            winer=1
        }
        if(player2.contains(2)&&player2.contains(5)&&player2.contains(8)){
            winer=2
        }
        if(player1.contains(1)&&player1.contains(4)&&player1.contains(7)){
            winer=1
        }
        if(player2.contains(1)&&player2.contains(4)&&player2.contains(7)){
            winer=2
        }
        if (winer != 0){
            Toast.makeText(this,"winner $winer",Toast.LENGTH_LONG).show()

        }
    }

}
