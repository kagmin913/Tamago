package com.example.tamago

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val minus = findViewById<TextView>(R.id.number)
        val restart = findViewById<Button>(R.id.restart)
        var egg1Image = findViewById<ImageView>(R.id.egg)
        var egg2Image = findViewById<ImageView>(R.id.firstEgg)
        var egg3Image = findViewById<ImageView>(R.id.secondEgg)
        var egg4Image = findViewById<ImageView>(R.id.ThirdEgg)
        var egg5Image = findViewById<ImageView>(R.id.LastEgg)
        var number = 100;


        egg1Image.visibility = View.VISIBLE
        egg2Image.visibility = View.INVISIBLE
        egg3Image.visibility = View.INVISIBLE
        egg4Image.visibility = View.INVISIBLE
        egg5Image.visibility = View.INVISIBLE

        egg1Image.setOnClickListener {
            number--
            minus.setText(number.toString())
            if(number==80) {
                egg1Image.visibility = View.INVISIBLE
                egg2Image.visibility = View.VISIBLE

                egg2Image.setOnClickListener {
                    number--
                    minus.setText(number.toString())
                    if (number == 50) {
                        egg2Image.visibility = View.INVISIBLE
                        egg3Image.visibility = View.VISIBLE

                        egg3Image.setOnClickListener {
                            number--
                            minus.setText(number.toString())
                            if (number == 10) {
                                egg3Image.visibility = View.INVISIBLE
                                egg4Image.visibility = View.VISIBLE

                                egg4Image.setOnClickListener {
                                    number--
                                    minus.setText(number.toString())
                                    if (number == 0) {
                                        egg4Image.visibility = View.INVISIBLE
                                        egg5Image.visibility = View.VISIBLE

                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
        restart.setOnClickListener {
            number=100
            minus.setText(number.toString())
            egg1Image.visibility = View.VISIBLE
            egg2Image.visibility = View.INVISIBLE
            egg3Image.visibility = View.INVISIBLE
            egg4Image.visibility = View.INVISIBLE
            egg5Image.visibility = View.INVISIBLE
        }


    }
}