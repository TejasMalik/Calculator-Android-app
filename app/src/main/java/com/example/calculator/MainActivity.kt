package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var calc1: Float = 0f
    var calc2: Float = 0f

    var add:Boolean = false
    var sub:Boolean = false
    var mul:Boolean = false
    var div:Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn1.setOnClickListener(View.OnClickListener {
            val rv = result.text.toString() + "1"
            result.setText(rv)
        })
        btn2.setOnClickListener(View.OnClickListener {
            val rv = result.text.toString() + "2"
            result.setText(rv)
        })
        btn3.setOnClickListener(View.OnClickListener {
            val rv = result.text.toString() + "3"
            result.setText(rv)
        })
        btn4.setOnClickListener(View.OnClickListener {
            val rv = result.text.toString() + "4"
            result.setText(rv)
        })
        btn5.setOnClickListener(View.OnClickListener {
            val rv = result.text.toString() + "5"
            result.setText(rv)
        })
        btn6.setOnClickListener(View.OnClickListener {
            val rv = result.text.toString() + "6"
            result.setText(rv)
        })
        btn7.setOnClickListener(View.OnClickListener {
            val rv = result.text.toString() + "7"
            result.setText(rv)
        })
        btn8.setOnClickListener(View.OnClickListener {
            val rv = result.text.toString() + "8"
            result.setText(rv)
        })
        btn9.setOnClickListener(View.OnClickListener {
            val rv = result.text.toString() + "9"
            result.setText(rv)
        })
        btn0.setOnClickListener(View.OnClickListener {
            val rv = result.text.toString() + "0"
            result.setText(rv)
        })
        btnAdd.setOnClickListener(View.OnClickListener {
            add = true
            sub = false
            mul = false
            div = false

            calc1 = result.text.toString().toFloat()
            result.setText("")
        })
        btnSub.setOnClickListener(View.OnClickListener {
            sub = true
            add = false
            mul = false
            div = false

            calc1 = result.text.toString().toFloat()
            result.setText("")
        })
        btnMul.setOnClickListener(View.OnClickListener {
            mul = true
            add = false
            sub = false
            div = false

            calc1 = result.text.toString().toFloat()
            result.setText("")
        })
        btnDiv.setOnClickListener(View.OnClickListener {
            mul = false
            add = false
            sub = false
            div = true

            calc1 = result.text.toString().toFloat()
            result.setText("")
        })
        btnEq.setOnClickListener(View.OnClickListener {
            calc2 = result.text.toString().toFloat()
            if (add) {
                result.setText((calc1 + calc2).toString())
                add = false
            }else if (sub) {
                result.setText((calc1 - calc2).toString())
                sub = false
            }else if (mul) {
                result.setText((calc1*calc2).toString())
                mul = false
            }else if (div) {
                result.setText((calc1/calc2).toString())
                div = false
            }else {
                result.setText(calc2.toString())
            }
        })

        btnClear.setOnClickListener(View.OnClickListener {
            calc1 = 0f
            calc2 = 0f

            result.setText("")

            add = false
            sub = false
            mul = false
            div = false
        })

    }
}
