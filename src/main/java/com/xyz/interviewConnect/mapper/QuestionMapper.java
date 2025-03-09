package com.xyz.interviewConnect.mapper;

import com.xyz.interviewConnect.model.entity.Question;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

/**
* @author 74703
* @description 针对表【question(题目)】的数据库操作Mapper
* @createDate 2024-12-27 17:17:15
* @Entity com.xyz.interviewConnect.model.entity.Question
*/
public interface QuestionMapper extends BaseMapper<Question> {

    /**
     * 查询问题列表（包括已被删除的数据）
     */
    @Select("select * from question where updateTime >= #{minUpdateTime}")
    List<Question> listQuestionWithDelete(Date minUpdateTime);
}




