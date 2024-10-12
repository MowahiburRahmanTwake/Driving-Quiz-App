package com.twakeapps.drivingquizapp

import android.media.Image

data class QuizModel(
        val id:Int = 0,
        val question:String = "",
        val imageUrl:String ="",
        val answers: Array<String> = arrayOf(),
        val correctAnsIndex:Int = 0
                    )
