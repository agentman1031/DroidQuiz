package com.raywenderlich.droidquiz.view.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.raywenderlich.droidquiz.view.data.model.Answer
import com.raywenderlich.droidquiz.view.data.model.Question

@Database(entities = [(Question::class), (Answer::class)],
version = 1)
abstract class QuizDatabase : RoomDatabase() {

    abstract fun quizDao(): QuizDao
}