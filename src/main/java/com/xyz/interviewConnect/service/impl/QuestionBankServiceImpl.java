package com.xyz.interviewConnect.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyz.interviewConnect.model.entity.QuestionBank;
import generator.service.QuestionBankService;
import com.xyz.interviewConnect.mapper.QuestionBankMapper;
import org.springframework.stereotype.Service;

/**
* @author 74703
* @description 针对表【question_bank(题库)】的数据库操作Service实现
* @createDate 2024-12-27 17:17:15
*/
@Service
public class QuestionBankServiceImpl extends ServiceImpl<QuestionBankMapper, QuestionBank>
    implements QuestionBankService{

}




