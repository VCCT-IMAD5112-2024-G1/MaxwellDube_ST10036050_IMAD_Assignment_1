package com.example.assignment_1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clearBtn = findViewById<Button>(R.id.clearBtn)
        val generateBtn = findViewById<Button>(R.id.generateBtn)
        var viewAge = findViewById<TextView>(R.id.viewAge)
        var message = findViewById<TextView>(R.id.message)



        generateBtn.setOnClickListener {

            if (viewAge.text.toString().toIntOrNull() != null ) {
                var intViewAge = viewAge.text.toString().toInt()

                if (intViewAge >= 20 && intViewAge <= 29) {
                    message.text = "20-29 age range just like Tupac Amaru Shakur (2Pac), who is widely considered one of the most influential and successful rappers of all time." +
                            "Much of Shakur's music has been noted for addressing contemporary social issues that plagued inner cities. 2pac passed at age 25"

                } else if (intViewAge >= 30 && intViewAge <= 39) {
                    message.text = "(You fit in the 30-39 age range) Lisa Nicole Lopes was only 30 when she passed (May 27, 1971 – April 25, 2002), " +
                            "better known by her stage name Left Eye, was an American rapper and singer. " +
                            "She was a member of the R&B woman group TLC,"

                } else if (intViewAge >= 40 && intViewAge <= 49) {
                    var ans = 0
                    if (intViewAge < 46){
                        ans = (46 - intViewAge)
                    }
                    if (intViewAge > 46) {
                        ans = (intViewAge - 46)
                    }
                    message.text = " $ans year age differnce from John F. Kennedy who was the 35th President of the United States (1961-1963)," +
                                " the youngest man elected to the office. Kennedy died at 46."

                } else if (intViewAge >= 50 && intViewAge <= 59) {
                    message.text = "$intViewAge!, Michael Jackson passed on at age 50, He was an American singer," +
                            " dancer who was the most popular entertainer in the world in the early and mid-1980s."

                } else if (intViewAge >= 60 && intViewAge <= 69) {
                    message.text = "60-69 age range just like Diego Armando Maradona who was an Argentine professional football player and manager. " +
                            "Widely regarded as one of the greatest players in the history of the sport."

                } else if (intViewAge >= 70 && intViewAge <= 79) {
                    message.text = "Same age range as Alexander Graham Bell who was a Scottish-born Canadian-American inventor, " +
                            "scientist and engineer who is credited with patenting the first practical telephone.Hi Maxwell was 19"

                } else if (intViewAge >= 80 && intViewAge <= 89) {
                    message.text = " You are in the 40-49 age range! An accomplished diplomat,an america's scientist, inventor, politician," +
                            "Benjamin Franklin was widely admired as the first U.S. ambassador to France. " +
                            "Benjamin Franklin died at age 84 on April 17, 1790."

                } else if (intViewAge >= 90 && intViewAge <= 100) {
                    message.text = "You age is between 90-100, did you know that One of the most influential artists of the 20th century, " +
                            "he is known for co-founding the invention of constructed sculpture, " +
                            "the co-invention of collage. Picasso  was a Spanish painter, sculptor, printmaker passed away at age 91."
                } else {
                    Toast.makeText(this@MainActivity, "The age is out of range", Toast.LENGTH_LONG)
                        .show()
                }
            }else{
                viewAge.text = ""
                message.text = ""
                Toast.makeText(this@MainActivity,"Your age must be an integer", Toast.LENGTH_LONG).show()
            }


        }

        clearBtn.setOnClickListener {
            viewAge.text = ""
            message.text = ""
        }

    }
}