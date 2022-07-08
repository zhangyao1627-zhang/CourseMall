package com.neusoft.coursemall.courses.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.common.utils.Query;

import com.neusoft.coursemall.courses.dao.CourseSpuCommentDao;
import com.neusoft.coursemall.courses.entity.CourseSpuCommentEntity;
import com.neusoft.coursemall.courses.service.CourseSpuCommentService;


@Service("courseSpuCommentService")
public class CourseSpuCommentServiceImpl extends ServiceImpl<CourseSpuCommentDao, CourseSpuCommentEntity> implements CourseSpuCommentService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CourseSpuCommentEntity> page = this.page(
                new Query<CourseSpuCommentEntity>().getPage(params),
                new QueryWrapper<CourseSpuCommentEntity>()
        );

        return new PageUtils(page);
    }

}