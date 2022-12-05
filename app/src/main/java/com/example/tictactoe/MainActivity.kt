package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var player = "p1"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var b1 = findViewById<Button>(R.id.b1)
        var b2 = findViewById<Button>(R.id.b2)
        var b3 = findViewById<Button>(R.id.b3)
        var b4 = findViewById<Button>(R.id.b4)
        var b5 = findViewById<Button>(R.id.b5)
        var b6 = findViewById<Button>(R.id.b6)
        var b7 = findViewById<Button>(R.id.b7)
        var b8 = findViewById<Button>(R.id.b8)
        var b9 = findViewById<Button>(R.id.b9)
        b1.setOnClickListener {
            if (b1.text == "") {
                if (player == "p1") {
                    player = "p2"
                    b1.text = "X"
                } else {
                    player == "p1"
                    b1.text = "0"

                }


            }

        }
        b2.setOnClickListener {
            if (b2.text == "") {
                if (player == "p1") {
                    player = "p2"
                    b2.text = "X"
                } else {
                    player == "p1"
                    b2.text = "0"

                }


            }

        }
        b3.setOnClickListener {
            if (b3.text == "") {
                if (player == "p1") {
                    player = "p2"
                    b3.text = "X"
                } else {
                    player == "p1"
                    b3.text = "0"

                }


            }

        }
        b4.setOnClickListener {
            if (b4.text == "") {
                if (player == "p1") {
                    player = "p2"
                    b4.text = "X"
                } else {
                    player == "p1"
                    b4.text = "0"

                }


            }

        }
        b5.setOnClickListener {
            if (b5.text == "") {
                if (player == "p1") {
                    player = "p2"
                    b5.text = "X"
                } else {
                    player == "p1"
                    b5.text = "0"

                }


            }

        }
        b6.setOnClickListener {
            if (b6.text == "") {
                if (player == "p1") {
                    player = "p2"
                    b6.text = "X"
                } else {
                    player == "p1"
                    b6.text = "0"

                }


            }

        }
        b7.setOnClickListener {
            if (b7.text == "") {
                if (player == "p1") {
                    player = "p2"
                    b7.text = "X"
                } else {
                    player == "p1"
                    b7.text = "0"

                }


            }

        }
        b8.setOnClickListener {
            if (b8.text == "") {
                if (player == "p1") {
                    player = "p2"
                    b8.text = "X"
                } else {
                    player == "p1"
                    b8.text = "0"

                }


            }

        }
        b9.setOnClickListener {
            if (b9.text == "") {
                if (player == "p1") {
                    player = "p2"
                    b9.text = "X"
                } else {
                    player == "p1"
                    b9.text = "0"

                }


            }

        }

        if (b1.text=="X" && b2.text=="X" && b3.text=="X"){
            Toast.makeText(this, "X Won The Game", Toast.LENGTH_SHORT).show()

        }
        if (b1.text=="0" && b2.text=="0" && b3.text=="0"){
            Toast.makeText(this, "0 Won The Game", Toast.LENGTH_SHORT).show()

        }
        if (b4.text=="X" && b5.text=="X" && b6.text=="X"){
            Toast.makeText(this, "X Won The Game", Toast.LENGTH_SHORT).show()

        }
        if (b4.text=="0" && b5.text=="0" && b6.text=="0"){
            Toast.makeText(this, "0 Won The Game", Toast.LENGTH_SHORT).show()

        }
        if (b7.text=="X" && b8.text=="X" && b9.text=="X"){
            Toast.makeText(this, "X Won The Game", Toast.LENGTH_SHORT).show()

        }
        if (b7.text=="0" && b8.text=="0" && b9.text=="0"){
            Toast.makeText(this, "0 Won The Game", Toast.LENGTH_SHORT).show()

        }
        if (b1.text=="X" && b4.text=="X" && b7.text=="X"){
            Toast.makeText(this, "X Won The Game", Toast.LENGTH_SHORT).show()

        }
        if (b1.text=="0" && b4.text=="0" && b7.text=="0"){
            Toast.makeText(this, "0 Won The Game", Toast.LENGTH_SHORT).show()

        }
        if (b2.text=="X" && b5.text=="X" && b8.text=="X"){
            Toast.makeText(this, "X Won The Game", Toast.LENGTH_SHORT).show()

        }
        if (b3.text=="X" && b6.text=="X" && b9.text=="X"){
            Toast.makeText(this, "X Won The Game", Toast.LENGTH_SHORT).show()

        }
        if (b2.text=="0" && b5.text=="0" && b8.text=="0"){
            Toast.makeText(this, "0 Won The Game", Toast.LENGTH_SHORT).show()

        }
        if (b3.text=="0" && b6.text=="0" && b9.text=="0"){
            Toast.makeText(this, "0 Won The Game", Toast.LENGTH_SHORT).show()

        }
        if (b1.text=="0" && b5.text=="0" && b9.text=="0"){
            Toast.makeText(this, "0 Won The Game", Toast.LENGTH_SHORT).show()

        }
        if (b1.text=="X" && b4.text=="X" && b7.text=="X"){
            Toast.makeText(this, "X Won The Game", Toast.LENGTH_SHORT).show()

        }
        if (b3.text=="0" && b4.text=="0" && b7.text=="0"){
            Toast.makeText(this, "0 Won The Game", Toast.LENGTH_SHORT).show()

        }
        if (b3.text=="X" && b4.text=="X" && b7.text=="X"){
            Toast.makeText(this, "X Won The Game", Toast.LENGTH_SHORT).show()

        }


        }

    }

