package com.womantalk.client.quiztype;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface QuizTypeRepository extends JpaRepository<QuizType, Integer>
{
    List <QuizType> findTop3ByIdQuizType (@Param("idQuizType") Integer idQuizType);

}
