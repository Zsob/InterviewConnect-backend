package com.xyz.interviewConnect.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyz.interviewConnect.model.entity.Question;
import com.xyz.interviewConnect.mapper.QuestionMapper;
import com.xyz.interviewConnect.service.QuestionService;
import org.springframework.stereotype.Service;

/**
* @author 74703
* @description 针对表【question(题目)】的数据库操作Service实现
* @createDate 2024-12-27 17:17:15
*/
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question>
    implements QuestionService {

}




