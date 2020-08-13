package com.raywenderlich.droidquiz.view.data.model

import androidx.room.*
import androidx.room.ForeignKey.CASCADE

@Entity(tableName = "answers",
    foreignKeys = [// 1
        ForeignKey(entity = Question::class,//2
            parentColumns = ["question_id"],// 3
            childColumns = ["question_id"],//4
            onDelete = CASCADE)// 5
                 ],
                 indices =  [Index("question_id")]) //only this line changes
data class Answer (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "answer_id")
    val answerId: Int,
    @ColumnInfo(name = "question_id")
    val questionId:Int,
    @ColumnInfo(name = "is_correct")
    val isCorrect: Boolean,
    val text: String
)