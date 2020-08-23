package com.example.calculator1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var first: Int = 0
        var second: Int = 0
        var result = 0
        var symbol: String = "+"

        button0.setOnClickListener {
            evaluateExpression("0", clear = true)
        }
        button1.setOnClickListener {
            evaluateExpression("1", clear = true)
        }
        button2.setOnClickListener {
            evaluateExpression("2", clear = true)
        }
        button3.setOnClickListener {
            evaluateExpression("3", clear = true)

        }
        button4.setOnClickListener {
            evaluateExpression("4", clear = true)

        }
        button5.setOnClickListener {
            evaluateExpression("5", clear = true)

        }
        button6.setOnClickListener {
            evaluateExpression("6", clear = true)

        }
        button7.setOnClickListener {
            evaluateExpression("7", clear = true)

        }
        button8.setOnClickListener {
            evaluateExpression("8", clear = true)

        }
        button9.setOnClickListener {
            evaluateExpression("9", clear = true)

        }
        buttonC.setOnClickListener {
            expressionTextView.text = ""
            resultTextView.text = ""
        }
        buttonP.setOnClickListener {
            evaluateExpression("+", clear = true)
            symbol = "+"

        }
        buttonM.setOnClickListener {
            evaluateExpression("-", clear = true)
            symbol = "-"

        }
        buttonN.setOnClickListener {
            evaluateExpression("/", clear = true)
            symbol = "/"

        }
        buttonX.setOnClickListener {
            evaluateExpression("*", clear = true)
            symbol = "*"

        }
        buttonE.setOnClickListener {
            when (symbol) {
                "+" -> result = first + second
                "-" -> result = first - second
                "*" -> result = first * second
                "/" -> result = first / second
            }
            resultTextView.text = result.toString()
//            val expression = ExpressionBuilder(expressionTextView.text.toString()).build()
//            val result = expression.evaluate()
//            val longResult = result.toLong()
//            if (result == longResult.toDouble()) {
//                resultTextView.text = longResult.toString()
//            } else {
//                resultTextView.text = result.toString()
//            }
        }
    }

    fun evaluateExpression(string: String, clear: Boolean) {
        if (clear) {
            resultTextView.text = "result"
            expressionTextView.append(string)
        } else {
            expressionTextView.append(resultTextView.text)
            expressionTextView.append(string)
            resultTextView.text = ""
        }
    }
}