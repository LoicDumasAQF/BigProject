package com.loicdumas.bigproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.loicdumas.calculator.AnotherCalculator
import com.loicdumas.calculator.Calculator
import com.loicdumas.readercalculatorlib.ReaderCalculator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val a = 8
        val b = 21
        val c = 15


        tv_main_activity.text = "BIG Project !"

        tv_main_activity.text = "${tv_main_activity.text.toString()} \n\n Somme de $a + $b + $c = ${Calculator.addition(a, b, c)}"
        tv_main_activity.text = "${tv_main_activity.text.toString()} \n\n Somme de $a + $b = ${AnotherCalculator.addition(a, b)}"

        tv_main_activity.text = "${tv_main_activity.text.toString()} \n\n Somme de $a + $b + $c = ${ReaderCalculator.readerAddition(a, b, c)}"
    }
}
