package com.womantalk.client.quiz;

import com.womantalk.client.option.Option;
import com.womantalk.client.question.Question;

import java.util.List;

/**
 * Created by Chintya on 7/13/2017.
 */
public class QuestionOption
{
    private List<Option> option;
    private List<Question> question;
    private Quiz quiz;

    public QuestionOption() {
    }

    public QuestionOption(List<Option> option, List<Question> question, Quiz quiz) {
        this.option = option;
        this.question = question;
        this.quiz = quiz;
    }

    public List<Option> getOption() {
        return option;
    }

    public void setOption(List<Option> option) {
        this.option = option;
    }

    public List<Question> getQuestion() {
        return question;
    }

    public void setQuestion(List<Question> question) {
        this.question = question;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }
}
