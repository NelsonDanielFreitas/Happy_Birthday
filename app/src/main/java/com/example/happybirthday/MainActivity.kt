package com.example.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.d("Tag", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Tag", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Tag", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Tag", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Tag", "onDestroy")
    }


}
/*fun main (){
    val diceRange = 1..6
    val randomNumber = diceRange.random()
    println("Random number: ${randomNumber}")
}*/
fun main () {
    val myFirstDice = Dice()
    println(myFirstDice.sides)
    myFirstDice.roll()
}
class Dice {
    var sides = 6
    fun roll (){
        val randomNumber = (1..6).random()
        println(randomNumber)    }
}