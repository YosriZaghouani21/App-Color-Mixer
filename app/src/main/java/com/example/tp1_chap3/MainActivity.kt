package com.example.tp1_chap3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.mix_btn)
        val red = findViewById<CheckBox>(R.id.ch_red)
        val yellow = findViewById<CheckBox>(R.id.ch_yellow)
        val blue = findViewById<CheckBox>(R.id.ch_blue)
        val name = findViewById<EditText>(R.id.nameField)



        button.setOnClickListener() {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("username",name.text.toString())
            if (name.text.toString().equals("")){
                Toast.makeText(this,"verify fields !", Toast.LENGTH_SHORT)
            }else{
                if (blue.isChecked ==true && yellow.isChecked==true && red.isChecked==false){
                intent.putExtra("result","green")
                    startActivity(intent)

                }else if (yellow.isChecked ==true && red.isChecked==true && blue.isChecked==false){
                    intent.putExtra("result","orange")
                    startActivity(intent)


                }else if (red.isChecked ==true && blue.isChecked==true && yellow.isChecked==false){
                    intent.putExtra("result","purple")
                    startActivity(intent)

                }else{
                    Toast.makeText(this,"Choose 2 colors",Toast.LENGTH_SHORT).show()

                }
            }


        }




    }

}