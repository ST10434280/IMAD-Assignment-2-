package com.example.imadassignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.text.style.BackgroundColorSpan
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.ProgressBar

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnFeed = findViewById<Button>(R.id.btnFeed)                                            //IIE, 2024
        val btnPlay = findViewById<Button>(R.id.btnPlay)                                            //IIE, 2024
        val btnClean = findViewById<Button>(R.id.btnClean)                                          //IIE, 2024
        val image = findViewById<ImageView>(R.id.image)                                             //IIE, 2024
        val backGr = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.backGr)   //IIE, 2024
        val progHun = findViewById<ProgressBar>(R.id.progHun)                                       //IIE, 2024
        val progClean = findViewById<ProgressBar>(R.id.progClean)                                   //IIE, 2024
        val progHap = findViewById<ProgressBar>(R.id.progHap)                                       //IIE, 2024
        // making the clean and hunger bars start at 100
        progClean.incrementProgressBy(100)                                                      //(Progress Bar in Android Studio - Master Coding, 2023)
        progHun.incrementProgressBy(100)                                                        //(Progress Bar in Android Studio - Master Coding, 2023)

        btnFeed.setOnClickListener {                                                         //(IIE, 2024)
            image.setImageResource(R.drawable.ax_eat)                                               //(IIE, 2024)
            backGr.setBackgroundResource(R.color.yellow)                                            //(How to Change the Background Color After Clicking the Button in Android? - GeeksforGeeks, 2022)
            progHun.incrementProgressBy(20)                                                     //(Progress Bar in Android Studio - Master Coding, 2023)
            progHap.incrementProgressBy(10)                                                     //(Progress Bar in Android Studio - Master Coding, 2023)
            progClean.incrementProgressBy(-10)                                                  //(Progress Bar in Android Studio - Master Coding, 2023)
           // making the action image only show for 4 second before going back
            Handler().postDelayed({                                                                 //( OpenAI, 2024) line 35 - 40
                image.setImageResource(R.drawable.ax_welcome)
            }, 4000)
            Handler().postDelayed({
                backGr.setBackgroundResource(R.color.pink)
            },4000)
        }
        btnPlay.setOnClickListener {                                                         //(IIE, 2024)
            image.setImageResource(R.drawable.ax_play)                                              //(IIE, 2024)
            backGr.setBackgroundResource(R.color.blue)                                              //(How to Change the Background Color After Clicking the Button in Android? - GeeksforGeeks, 2022)
            progHap.incrementProgressBy(20)                                                     //(Progress Bar in Android Studio - Master Coding, 2023)
            progHun.incrementProgressBy(-10)                                                    //(Progress Bar in Android Studio - Master Coding, 2023)
            progClean.incrementProgressBy(-10)                                                  //(Progress Bar in Android Studio - Master Coding, 2023)
            Handler().postDelayed({                                                                 //( OpenAI, 2024) line 48 - 53
                image.setImageResource(R.drawable.ax_welcome)
            }, 4000)
            Handler().postDelayed({
                backGr.setBackgroundResource(R.color.pink)
            },4000)
        }
        btnClean.setOnClickListener {
            image.setImageResource(R.drawable.ax_bath)                                              //(IIE, 2024)
            backGr.setBackgroundResource(R.color.bath)                                              //(How to Change the Background Color After Clicking the Button in Android? - GeeksforGeeks, 2022)
            progClean.incrementProgressBy(20)                                                   //(Progress Bar in Android Studio - Master Coding, 2023)
            progHap.incrementProgressBy(-10)                                                    //(Progress Bar in Android Studio - Master Coding, 2023)
            Handler().postDelayed({                                                                 //(OpenAI, 2024) line 60 - 62
                image.setImageResource(R.drawable.ax_welcome)
            }, 4000)
            Handler().postDelayed({
                backGr.setBackgroundResource(R.color.pink)
            },4000)

        }
    }
}

/* References:

GeeksforGeeks. 2022. How to Change the Background Color After Clicking the Button in Android, 5 December 2022.
[Online] available at:https://www.geeksforgeeks.org/how-to-change-the-background-color-after-clicking-the-button-in-android/ [accessed on 29 April 2024]

IIE. 2024. INTRODUCTION TO MOBILE APPLICATION DEVELOPMENT [IMAD5112/d/p/w MODULE OUTLINE].The Independent Institute of Education: Unpublished.

OpenAI. 2024. Chat-GPT (Version 3.5). [Large language model]. Available at: https://chat.openai.com/c/edbbfd63-0a2a-46fd-b5db-1d4b87f26592 [accessed 1 may 2024]

Progress Bar in Android Studio. YouTube video, added by Master Coding. [Online] available at: https://www.youtube.com/watch?v=VpnZ1wt5uDA [accessed 30 April 2024]

Vecteezy.[s.a].axolotl with burger cartoon vector illustration.
[online] available at:https://www.vecteezy.com/vector-art/24249758-axolotl-with-burger-cartoon-vector-illustration [accessed on 29 April 2024]

Vecteezy.[s.a].axolotl blowing bubbles cartoon vector illustration.
[online] available at:https://www.vecteezy.com/vector-art/24249755-axolotl-blowing-bubbles-cartoon-vector-illustration [accessed on 29 April 2024]

Vecteezy.[s.a].cute axolotl mascot cartoon character illustration in valentine day.
[online] available at:https://www.vecteezy.com/vector-art/6371999-cute-axolotl-mascot-cartoon-character-illustration-in-valentine-day [accessed on 29 April 2024]

Shutterstock.[s.a].Cute axolotl taking bubble bath in bathtub cartoon vector illustration.
[online] available at: https://www.shutterstock.com/image-vector/cute-axolotl-taking-bubble-bath-bathtub-2106167198 [accessed on 29 April 2024]




* */
