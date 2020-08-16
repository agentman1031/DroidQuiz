package com.raywenderlich.droidquiz.view.data

import android.os.AsyncTask
import androidx.lifecycle.LiveData
import com.raywenderlich.droidquiz.QuizApplication
import com.raywenderlich.droidquiz.view.data.db.QuizDao
import com.raywenderlich.droidquiz.view.data.model.Answer
import com.raywenderlich.droidquiz.view.data.model.Question
import com.raywenderlich.droidquiz.view.data.model.QuestionsAndAllAnswers

class Repository : QuizRepository{

    private val quizDao: QuizDao by lazy { QuizApplication.database.questionsDao() }
    private val allQuestions by lazy { quizDao.getAllQuestions()}
    private val allQuestionsAndAllAnswers by lazy { quizDao.getQuestionAndAllAnswers() }

    override fun getSavedQuestions() = allQuestions

    override fun saveQuestion(question: Question) {
        AsyncTask.execute { quizDao.insert(question) }
    }

    override fun saveAnswer(answer: Answer) {
        AsyncTask.execute { quizDao.insert(answer)}
    }

    override fun getQuestionAndAllAnswers() = allQuestionsAndAllAnswers

    override fun deleteQuestions() {
        AsyncTask.execute { quizDao.clearQuestions() }
    }
}