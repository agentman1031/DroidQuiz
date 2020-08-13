package com.raywenderlich.droidquiz.view.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "questions", indices =
[Index("question_id")]) // 1
data class Question(
    @PrimaryKey(autoGenerate = true) // 2
    @ColumnInfo(name = "question_id") // 3
    var questionId: Int,
    val text: String
)
