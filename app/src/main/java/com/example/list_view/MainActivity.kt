package com.example.list_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fruits.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        lvfruit.adapter= ArrayAdapter<String>(

            this,
            R.layout.fruits,
            R.id.textview,
            arrayOf(
                "Apple","Banana","Mango","Strawberry","blueberry"
            )

        )

        lvfruit.setOnItemClickListener { parent, view, position, id ->

            Toast.makeText(this,"Johnny ate ${position+1} ${view.textview.text}",Toast.LENGTH_SHORT).show()
        }
    }
}