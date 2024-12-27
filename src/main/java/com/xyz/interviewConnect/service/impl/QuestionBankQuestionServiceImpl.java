package com.xyz.interviewConnect.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyz.interviewConnect.model.entity.QuestionBankQuestion;
import generator.service.QuestionBankQuestionService;
import com.xyz.interviewConnect.mapper.QuestionBankQuestionMapper;
import org.springframework.stereotype.Service;

/**
* @author 74703
* @description 针对表【question_bank_question(题库题目)】的数据库操作Service实现
* @createDate 2024-12-27 17:17:15
*/
@Service
public class QuestionBankQuestionServiceImpl extends ServiceImpl<QuestionBankQuestionMapper, QuestionBankQuestion>
    implements QuestionBankQuestionService{

}




