package com.example.tp1_chap3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val name = intent.getStringExtra("username").toString()
        val groupe = findViewById<RadioGroup>(R.id.radioGroup)
        val choix = findViewById<TextView>(R.id.textView)
        val result = intent.getStringExtra("result")
        val button = findViewById<Button>(R.id.button)


        if(result=="green"){
            choix.text = ("You chose Blue and Yellow")
        } else if (result == "orange") {
            choix.text=("You chose Yellow and Red")
        }
            else if (result== "purple") {
                choix.text = ("You chose Blue and Red")

        }

        button.setOnClickListener {
            val genderId = groupe.checkedRadioButtonId
            val couleurString = resources.getResourceEntryName(genderId)
            intent = Intent(this,ResultActivity::class.java)
            intent.putExtra("username",name)



            if (couleurString.equals(result)){
                intent.putExtra("resultat",true)
                startActivity(intent)

            }else{
                intent.putExtra("resultat",false)
                startActivity(intent)
            }

        }




        }

    }
