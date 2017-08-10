package com.womantalk.client.quizrules;

import com.fasterxml.jackson.annotation.JsonView;
import com.womantalk.client.quiz.Quiz;
import com.womantalk.client.tools.View;

import javax.persistence.*;


@Entity
@Table (name = "t_quizRules")
public class QuizRules
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (columnDefinition = "serial")
    @JsonView(View.QuizRules.class)
    private Integer idRules;

    @Column
    private  Integer min;

    @Column
    private Integer max;

    @Column
    @JsonView(View.QuizRules.class)
    private String value;

    @Column
    @JsonView(View.QuizRules.class)
    private String description;

    @Column
    @JsonView(View.QuizRules.class)
    private String imageURL;

    @JsonView(View.QuizRules.class)
    private Integer rightAnswer;

    @JsonView(View.QuizRules.class)
    private Integer totalQuestion;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "idQuiz")
  //  @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Quiz quiz;

    public QuizRules() {
    }

    public Integer getIdRules() {
        return idRules;
    }

    public void setIdRules(Integer idRules) {
        this.idRules = idRules;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz)
    {
        this.quiz = quiz;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public Integer getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(Integer rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public Integer getTotalQuestion() {
        return totalQuestion;
    }

    public void setTotalQuestion(Integer totalQuestion) {
        this.totalQuestion = totalQuestion;
    }
}
