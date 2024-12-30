package com.xyz.interviewConnect.model.dto.question;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xyz.interviewConnect.common.PageRequest;
import com.xyz.interviewConnect.model.entity.Question;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * 查询题目请求
 *
 * @author <a href="https://github.com/Zsob">Zsob</a>
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class QuestionQueryRequest extends PageRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * id
     */
    private Long notId;

    /**
     * 搜索词
     */
    private String searchText;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 标签列表
     */
    private List<String> tags;

    /**
     * 推荐答案
     */
    private String answer;

    /**
     * 创建用户 id
     */
    private Long userId;

    /**
     * 题库编号
     */
    private Long questionBankId;

    private static final long serialVersionUID = 1L;
}