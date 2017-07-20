package com.womantalk.client.quiztype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizTypeServiceImpl implements QuizTypeService {
    @Autowired
    private QuizTypeRepository quizTypeRepository;


    @Override
    public List<QuizType> findAll()
    {
        List quizTypeList = quizTypeRepository.findAll();
        if (quizTypeList != null) {
            return quizTypeList;
        } else {
            return null;
        }
    }
}
