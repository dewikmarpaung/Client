package com.womantalk.client.quiz;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by gloria on 07/07/2017.
 */


@Repository
public interface QuizRepository extends JpaRepository <Quiz, Integer>
{
   // @Query ("select q.idQuiz, que.idQuiz, que.question from Quiz q join Question que on q.idQuiz = que.idQuiz where q.idQuiz = ?1")
    @Query ("select q.idQuiz, q.status, q.judulQuiz , que.question, o.text from Quiz q JOIN  q.questions que join que.options o where q.idQuiz = :idQuiz")
    List <Quiz> getAllDataQuiz (@Param("idQuiz") Integer idQuiz);


    @Query("select q from Quiz q where q.status like 'draf' ")
    List<Quiz> getAllQuizByStatus ();

    @Query ("select q from Quiz q where q.idQuiz = ?1")
    List <Quiz> getAllQuizByIdQuiz (@Param("idQuiz") Integer idQuiz);

    List <Quiz> findTop3ByIdQuizLessThanOrderByIdQuizDesc (int id);

    List<Quiz> findTop3ByQuizType (@Param("idQuizType") Integer idQuizType);




}
