package com.womantalk.client.quiztype;

import com.womantalk.client.quiz.Quiz;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table (name ="t_quizType")
public class QuizType
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (columnDefinition = "serial", name = "idQuizType")
    private Integer idQuizType;

    @Column
    private String typeName;

    @OneToMany (mappedBy = "quizType", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Quiz> quizs;

    @Version
    @Column(name = "optVersion", columnDefinition = "integer DEFAULT 0 ")
    private Integer version;

    public QuizType()
    {
    }

    public Integer getIdQuizType() {
        return idQuizType;
    }

    public void setIdQuizType(Integer idQuizType) {
        this.idQuizType = idQuizType;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
