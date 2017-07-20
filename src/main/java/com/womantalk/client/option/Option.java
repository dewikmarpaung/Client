package com.womantalk.client.option;

import com.fasterxml.jackson.annotation.JsonView;
import com.womantalk.client.question.Question;
import com.womantalk.client.quiz.View;

import javax.persistence.*;


@Entity
@Table (name ="t_option")
public class Option
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (columnDefinition = "serial")
    @JsonView(View.AllQuiz.class)
    private Integer idOption;

    @JsonView (View.AllQuiz.class)
    private String text;

    @JsonView (View.AllQuiz.class)
    private String imageURL;

    @JsonView (View.AllQuiz.class)
    private String type;

    private Integer value;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name = "id_question")
   // @JsonIgnore
    private Question question;

    public Option() {
    }

    public Integer getIdOption()
    {
        return idOption;
    }

    public void setIdOption(Integer idOption)
    {
        this.idOption = idOption;
    }

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    public String getImageURL()
    {
        return imageURL;
    }

    public void setImageURL(String imageURL)
    {
        this.imageURL = imageURL;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public Integer getValue()
    {
        return value;
    }

    public void setValue(Integer value)
    {
        this.value = value;
    }

    public Question getQuestion()
    {
        return question;
    }

    public void setQuestion(Question question)
    {
        this.question = question;
    }
}
