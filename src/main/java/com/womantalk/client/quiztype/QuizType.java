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
<<<<<<< HEAD
    //@JsonBackReference
    //@JsonIgnore
    //@JsonManagedReference
=======
>>>>>>> 965648bde16c8b7d7278a6923bba40f9a19271be
    private Set<Quiz> quizs;

    @Version
    @Column(name = "optVersion", columnDefinition = "integer DEFAULT 0 ")
    private Integer version;

<<<<<<< HEAD
    public QuizType() {
=======
    public QuizType()
    {
>>>>>>> 965648bde16c8b7d7278a6923bba40f9a19271be
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

<<<<<<< HEAD
//    public Set<Quiz> getQuizs() {
//        return quizs;
//    }
//
//    public void setQuizs(Set<Quiz> quizs)
//    {
//        this.quizs = quizs;
//    }

=======
>>>>>>> 965648bde16c8b7d7278a6923bba40f9a19271be
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
