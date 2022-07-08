package com.neusoft.coursemall.courses.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.common.utils.Query;

import com.neusoft.coursemall.courses.dao.CourseCommentReplayDao;
import com.neusoft.coursemall.courses.entity.CourseCommentReplayEntity;
import com.neusoft.coursemall.courses.service.CourseCommentReplayService;


@Service("courseCommentReplayService")
public class CourseCommentReplayServiceImpl extends ServiceImpl<CourseCommentReplayDao, CourseCommentReplayEntity> implements CourseCommentReplayService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CourseCommentReplayEntity> page = this.page(
                new Query<CourseCommentReplayEntity>().getPage(params),
                new QueryWrapper<CourseCommentReplayEntity>()
        );

        return new PageUtils(page);
    }

}