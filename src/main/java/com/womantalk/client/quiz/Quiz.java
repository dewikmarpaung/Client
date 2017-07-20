package com.womantalk.client.quiz;

import com.fasterxml.jackson.annotation.JsonView;
import com.womantalk.client.question.Question;
import com.womantalk.client.quizrules.QuizRules;
import com.womantalk.client.quiztype.QuizType;
<<<<<<< HEAD
=======
import com.womantalk.client.tools.View;
>>>>>>> 965648bde16c8b7d7278a6923bba40f9a19271be

import javax.persistence.*;
import java.util.Date;
import java.util.Set;


@Entity
@Table (name ="t_quiz")
public class Quiz
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (columnDefinition = "serial", name = "idQuiz")
    @JsonView(View.Quiz.class)
    private Integer idQuiz;


    @Column(name = "judulQuiz")
    @JsonView(View.Quiz.class)
    private String judulQuiz;


    @Column(name = "imageURL")
    @JsonView(View.Quiz.class)
    private String imageURL;


    @Column(name = "status")
    private String status;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "draft_date")
   // @JsonView(View.Public.class)
    public Date draft_date;

    @Temporal(TemporalType.TIMESTAMP)
 // @JsonView(View.Public.class)
    @Column(name = "published_date")
  //  @JsonView(View.Public.class)
    public Date published_date;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_modified")
  //  @JsonView(View.Public.class)
    public Date last_modified;


    @ManyToOne (fetch = FetchType.EAGER , cascade = {CascadeType.ALL} )
    @JoinColumn (name = "idQuizType")
   // @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
   // @JsonView(View.Public.class)
    private QuizType quizType;

    @JsonView (View.AllQuiz.class)
    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set <Question> questions;

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
   // @JsonIgnore
    private Set <QuizRules> quizRules;

    public Quiz()
    {

    }

    public Integer getIdQuiz() {
        return idQuiz;
    }

    public void setIdQuiz(Integer idQuiz) {
        this.idQuiz = idQuiz;
    }

    public String getJudulQuiz() {
        return judulQuiz;
    }

    public void setJudulQuiz(String judulQuiz) {
        this.judulQuiz = judulQuiz;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public QuizType getQuizType() {
        return quizType;
    }

    public int getQuizId()
    {
        return quizType.getIdQuizType();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setQuizType(QuizType quizType) {
        this.quizType = quizType;
    }

    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }

    public Set<QuizRules> getQuizRules() {
        return quizRules;
    }

    public void setQuizRules(Set<QuizRules> quizRules) {
        this.quizRules = quizRules;
    }

    @PreUpdate
    void lastModified() {
        this.last_modified = new Date();
    }

    @PrePersist
    void draftDate(){
        this.draft_date = this.last_modified = new Date();
    }

    public Date getPublished_date() {
        return published_date;
    }

    public void setPublished_date(Date published_date) {
        this.published_date = published_date;
    }
}
