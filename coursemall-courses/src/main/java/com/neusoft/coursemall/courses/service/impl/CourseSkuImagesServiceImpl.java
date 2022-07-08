package com.neusoft.coursemall.courses.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.common.utils.Query;

import com.neusoft.coursemall.courses.dao.CourseSkuImagesDao;
import com.neusoft.coursemall.courses.entity.CourseSkuImagesEntity;
import com.neusoft.coursemall.courses.service.CourseSkuImagesService;


@Service("courseSkuImagesService")
public class CourseSkuImagesServiceImpl extends ServiceImpl<CourseSkuImagesDao, CourseSkuImagesEntity> implements CourseSkuImagesService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CourseSkuImagesEntity> page = this.page(
                new Query<CourseSkuImagesEntity>().getPage(params),
                new QueryWrapper<CourseSkuImagesEntity>()
        );

        return new PageUtils(page);
    }

}