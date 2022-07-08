package com.neusoft.coursemall.courses.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.common.utils.Query;

import com.neusoft.coursemall.courses.dao.CourseCategoryDao;
import com.neusoft.coursemall.courses.entity.CourseCategoryEntity;
import com.neusoft.coursemall.courses.service.CourseCategoryService;


@Service("courseCategoryService")
public class CourseCategoryServiceImpl extends ServiceImpl<CourseCategoryDao, CourseCategoryEntity> implements CourseCategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CourseCategoryEntity> page = this.page(
                new Query<CourseCategoryEntity>().getPage(params),
                new QueryWrapper<CourseCategoryEntity>()
        );

        return new PageUtils(page);
    }

}