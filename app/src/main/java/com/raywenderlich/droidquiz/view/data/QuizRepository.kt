package com.raywenderlich.droidquiz.view.data

import androidx.lifecycle.LiveData
import com.raywenderlich.droidquiz.view.data.model.Answer
import com.raywenderlich.droidquiz.view.data.model.Question
import com.raywenderlich.droidquiz.view.data.model.QuestionsAndAllAnswers

interface QuizRepository {

    fun getSavedQuestions(): LiveData<List<Question>>
    fun saveQuestion(question: Question)
    fun saveAnswer(answer: Answer)
    fun getQuestionAndAllAnswers(): LiveData<List<QuestionsAndAllAnswers>>

    fun deleteQuestions()
}