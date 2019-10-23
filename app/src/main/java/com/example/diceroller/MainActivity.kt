package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var dice_Image : ImageView
    lateinit var dice_Image1 : ImageView
    lateinit var dice_Image2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dice_Image = findViewById(R.id.dice_image)
        dice_Image1 = findViewById(R.id.dice_image1)
        dice_Image2 = findViewById(R.id.dice_image2)

        val rollButton: Button = findViewById(R.id.roll_button)
        val countUpButton: Button = findViewById(R.id.countUp_button)
        val resetButton: Button = findViewById(R.id.reset_button)
        rollButton.setOnClickListener { rollDice() }
        /*countUpButton.setOnClickListener { countUp() }
        resetButton.setOnClickListener { reset() }*/
    }


    private fun rollDice(){
        Toast.makeText(this, "Toast",
            Toast.LENGTH_SHORT).show()

        dice_Image.setImageResource(randomInt())
        dice_Image1.setImageResource(randomInt())
        dice_Image2.setImageResource(randomInt())


    }

    private fun randomInt() : Int {

        val randomInt = Random().nextInt(6) + 1
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        return drawableResource
    }
    /*
    private fun countUp(){
        val resultText: TextView = findViewById(R.id.result_text)
        val resultText1: TextView = findViewById(R.id.result_text1)
        val resultText2: TextView = findViewById(R.id.result_text2)

        if (resultText.text == "Dice Rolled!"){
            resultText.text = "1"

        }else if(resultText1.text == "Dice Rolled!"){
            resultText1.text = "1"
        }else if(resultText2.text == "Dice Rolled!"){
            resultText2.text = "1"
        }
        else{
            var resultInt = resultText.text.toString().toInt()
            var resultInt1 = resultText1.text.toString().toInt()
            var resultInt2 = resultText2.text.toString().toInt()

            if(resultInt < 6){
                resultInt ++
                resultText.text = resultInt.toString()
            }
            if(resultInt1 < 6){
                resultInt1 ++
                resultText1.text = resultInt1.toString()
            }
            if(resultInt2 < 6){
                resultInt2 ++
                resultText2.text = resultInt2.toString()
            }
        }
    }

    private fun reset(){
        val resultText: TextView = findViewById(R.id.result_text)
        val resultText1: TextView = findViewById(R.id.result_text1)
        val resultText2: TextView = findViewById(R.id.result_text2)

        if (resultText.text == "Dice Rolled!"){
            resultText.text = "0"

        }else if(resultText1.text == "Dice Rolled!"){
            resultText1.text = "0"
        }else if(resultText2.text == "Dice Rolled!"){
            resultText2.text = "0"
        }else{

            var resultInt = resultText.text.toString().toInt()
            var resultInt1 = resultText1.text.toString().toInt()
            var resultInt2 = resultText2.text.toString().toInt()

            resultInt = 0
            resultText.text = resultInt.toString()
            resultInt1 = 0
            resultText1.text = resultInt1.toString()
            resultInt2 = 0
            resultText2.text = resultInt2.toString()
        }



    }

     */
}
