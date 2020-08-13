package com.raywenderlich.droidquiz.view.data.db

import androidx.room.*
import com.raywenderlich.droidquiz.view.data.model.Answer
import com.raywenderlich.droidquiz.view.data.model.Question
import com.raywenderlich.droidquiz.view.data.model.QuestionsAndAllAnswers

@Dao
interface QuizDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(question: Question)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(answer: Answer)

    @Query("DELETE FROM questions")
    fun clearQuestions()

    @Query("SELECT * FROM questions ORDER BY question_id") // 1
    fun getAllQuestions(): List<Question>

    @Delete
    fun deleteQuestion(question: Question)

    @Transaction // 2
    @Query("SELECT * FROM questions") // 3
    fun getQuestionAndAllAnswers(): List<QuestionsAndAllAnswers>
}