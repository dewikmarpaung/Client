package com.womantalk.client.question;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer>
{
    @Query("select q from Question q where q.quiz = :idQuiz")
    List<Question> findQuestionByQuiz(@Param("idQuiz") Integer idQuiz);
}
