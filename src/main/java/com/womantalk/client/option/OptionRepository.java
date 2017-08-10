package com.womantalk.client.option;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OptionRepository extends JpaRepository<Option, Integer>
{
        //@Query("select o.question, o.type, o.text, o.imageURL, o.idOption, o.value from Option o where o.question = :idQuestion")
        @Query("select o from Option o where o.question = :idQuestion")
        List<Option> findAllOptionByQuestion(@Param("idQuestion") Integer idQuestion);

        @Query("select o.value from Option  o where o.idOption =?1")
        List <Option> findValueByIdOption (@Param("idOption") Integer idOption);

        @Query ("select  o.value from Option  o where o.value=1")
        List<Option> findRightAnswer ();

}
