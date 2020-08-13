package com.raywenderlich.droidquiz

import android.app.Application
import androidx.room.Room
import com.raywenderlich.droidquiz.view.data.db.QuizDatabase

class QuizApplication : Application() {
    // 1
    companion object {
        lateinit var database: QuizDatabase // 2
            private set
    }

    override fun onCreate() {
        super.onCreate()
        database = Room
            .databaseBuilder(
                this,
                QuizDatabase::class.java,
                "quiz_database"
            ) // 3
            .build()
    }
}