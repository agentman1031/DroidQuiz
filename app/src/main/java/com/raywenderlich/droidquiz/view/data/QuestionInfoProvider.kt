package com.raywenderlich.droidquiz.view.data

import com.raywenderlich.droidquiz.view.data.model.Answer
import com.raywenderlich.droidquiz.view.data.model.Question

object QuestionInfoProvider {

    var questionList = initQuestionList()
    var answerList = initAnswersList()

    private fun initQuestionList(): MutableList<Question> {
        val questions = mutableListOf<Question>()
        questions.add(
            Question(
                1,
                "Which of the following languages is not commonly used to develop Android Apps"
            )
        )
        questions.add(
            Question(
                2,
                "What is the meaning of life?"
            )
        )
        return questions

    }

    private fun initAnswersList(): MutableList<Answer> {
        val answers = mutableListOf<Answer>()
        answers.add(
            Answer(
                1,
                1,
                true,
                "Java"
            )
        )
        answers.add(
            Answer(
                2,
                1,
                false,
                "Kotlin"
            )
        )
        answers.add(
            Answer(
                3,
                1,
                false,
                "Ruby"
            )
        )
        answers.add(
            Answer(
                4,
                2,
                true,
                "42"
            )
        )
        answers.add(
            Answer(
                5,
                2,
                false,
                "35"
            )
        )
        answers.add(
            Answer(
                6,
                2,
                false,
                "7"
            )
        )
        return answers
    }
}