package com.example.myapplication3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.sqrt
import kotlin.math.tan

class MainActivity : AppCompatActivity() {
    private lateinit var resultTextView: TextView
    private var operand :Double=0.0
    private var operation1 :String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView = findViewById(R.id.resultTextView)

    }
    fun numberClick(clickedView: View) {

        if (clickedView is TextView) {

            var result = resultTextView.text.toString()
            val number = clickedView.text.toString()

            if (result=="0") {
                result = ""
            }
            resultTextView.text = result + number
        }
    }

    fun operationClick(clickedView: View){
        if (clickedView is TextView) {

            val result: String = resultTextView.text.toString()

            if (result.isNotEmpty()) {
                operand = result.toDouble()
            }
            operation1= clickedView.text.toString()
            resultTextView.text=""
        }
    }
    fun equalClick(clickedView: View){
        val secOperandText: String = resultTextView.text.toString()
        var secOperand: Double=0.0
        if(secOperandText.isNotEmpty()){
            secOperand = secOperandText.toDouble()
        }
        when(operation1) {
            "+" -> resultTextView.text = (operand + secOperand).toString()
            "-" -> resultTextView.text = (operand - secOperand).toString()
            "*" -> resultTextView.text = (operand * secOperand).toString()
            "/" -> resultTextView.text = (operand / secOperand).toString()
        }
        val num1 = operand.toString()
        when(num1){
            "SQRT" -> resultTextView.text = sqrt(operand).toString()
            "sin" -> resultTextView.text = sin(operand).toString()
            "cos" -> resultTextView.text = cos(operand).toString()
            "tan" -> resultTextView.text = tan(operand).toString()

        }
    }

    fun clearClick(clickedView: View){
        val result = resultTextView.text
        if (result.isNotEmpty()){
            resultTextView.text = ""

        }
    }

    fun sqrtClick(clickedView: View){
        val res = sqrt(operand)
        if (resultTextView.text.isNotEmpty()){
            resultTextView.text= res.toString()
        }


    }
    fun sinClick(clickedView: View){
        val res1= sin(operand)
        if (resultTextView.text.isNotEmpty()){
            resultTextView.text = res1.toString()
        }

    }
    fun cosClick(clickedView: View){
        val res2 = cos(operand)
        if(resultTextView.text.isNotEmpty()){
            resultTextView.text= res2.toString()
        }
    }
    fun tanClick(clickedView: View){
        val res3 = tan(operand)
        if (resultTextView.text.isNotEmpty()){
            resultTextView.text= res3.toString()
        }
    }






}
