package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val num1:EditText=findViewById(R.id.editTextText)
        val num2:EditText=findViewById(R.id.editTextText2)
        val b1:Button=findViewById(R.id.sum)
        val b2:Button=findViewById(R.id.sub)
        val b3:Button=findViewById(R.id.mul)
        val b4:Button=findViewById(R.id.div)
        val result:TextView=findViewById(R.id.textView)


        b1.setOnClickListener(
            {
                val a=num1.text.toString()
                val b=num2.text.toString()
                val sum=a.toInt()+b.toInt()
                result.text="result:$sum"
            })
        b2.setOnClickListener({
            val a=num1.text.toString()
            val b=num2.text.toString()
            val sub=a.toInt()-b.toInt()
            result.text="result:$sub"
        })
        b3.setOnClickListener({
            val a=num1.text.toString()
            val b=num2.text.toString()
            val mul=a.toInt()*b.toInt()
            result.text="result:$mul"
        })
        b4.setOnClickListener({
            val a=num1.text.toString()
            val b=num2.text.toString()
            val div=a.toInt()/b.toInt()
            result.text="result:$div"
        })

        val b5:Button=findViewById(R.id.button5)
        b5.setOnClickListener({
//            val intent = Intent(this, SecondActivity::class.java)
//            intent.putExtra("message", "Hello from MainActivity!")
//            startActivity(intent)
        })

    }
}