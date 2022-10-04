package com.example.tp1_chap3

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val result=intent.getBooleanExtra("resultat",true)
        val img =findViewById<ImageView>(R.id.imageView2)
        val back = findViewById<ConstraintLayout>(R.id.constraintLayout)
        val nom = findViewById<TextView>(R.id.textView3)
        val hello = findViewById<TextView>(R.id.textView4)
        val button = findViewById<Button>(R.id.button3)
        val name = intent.getStringExtra("username").toString()


        nom.text

        if (result){
            img.setBackgroundResource(R.drawable.ic_baseline_visibility_24)
            back.setBackgroundColor(Color.GREEN);
            nom.text="Okay "+name
            hello.text="YOU WIN "

        }
        else{
            img.setBackgroundResource(R.drawable.ic_baseline_close_24)
            nom.text="NOOOO "+name
            hello.text="YOU LOSE !! "
        }

        button.setOnClickListener {
            intent =Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}