package com.womantalk.client.question;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer>
{
    @Query("select q from Question q where q.quiz = :idQuiz")
    List<Question> findQuestionByQuiz(@Param("idQuiz") Integer idQuiz);
=======
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer>
{
/*    @Query("select q from Question q where q.quiz = :idQuiz")
    List<Question> findQuestionByQuiz(@Param("idQuiz") Integer idQuiz);*/
>>>>>>> 965648bde16c8b7d7278a6923bba40f9a19271be
}
