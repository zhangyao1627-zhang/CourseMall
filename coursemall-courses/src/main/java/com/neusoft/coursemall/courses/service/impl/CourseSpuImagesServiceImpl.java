package com.neusoft.coursemall.courses.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.common.utils.Query;

import com.neusoft.coursemall.courses.dao.CourseSpuImagesDao;
import com.neusoft.coursemall.courses.entity.CourseSpuImagesEntity;
import com.neusoft.coursemall.courses.service.CourseSpuImagesService;


@Service("courseSpuImagesService")
public class CourseSpuImagesServiceImpl extends ServiceImpl<CourseSpuImagesDao, CourseSpuImagesEntity> implements CourseSpuImagesService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CourseSpuImagesEntity> page = this.page(
                new Query<CourseSpuImagesEntity>().getPage(params),
                new QueryWrapper<CourseSpuImagesEntity>()
        );

        return new PageUtils(page);
    }

}