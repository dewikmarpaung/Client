package com.womantalk.client.quiztype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizTypeServiceImpl implements QuizTypeService {
    @Autowired
    private QuizTypeRepository quizTypeRepository;


    @Override
<<<<<<< HEAD
    public List<QuizType> findAll() {
=======
    public List<QuizType> findAll()
    {
>>>>>>> 965648bde16c8b7d7278a6923bba40f9a19271be
        List quizTypeList = quizTypeRepository.findAll();
        if (quizTypeList != null) {
            return quizTypeList;
        } else {
            return null;
        }
    }
}
