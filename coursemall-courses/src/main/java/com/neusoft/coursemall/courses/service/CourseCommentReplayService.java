package com.neusoft.coursemall.courses.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.coursemall.courses.entity.CourseCommentReplayEntity;

import java.util.Map;

/**
 * 课程的评价和评论
 *
 * @author zhangyao
 * @email zhangyao1627@gmail.com
 * @date 2022-07-08 09:38:26
 */
public interface CourseCommentReplayService extends IService<CourseCommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

