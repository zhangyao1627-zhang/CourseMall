package com.neusoft.coursemall.courses.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.common.utils.Query;

import com.neusoft.coursemall.courses.dao.CourseAttrDao;
import com.neusoft.coursemall.courses.entity.CourseAttrEntity;
import com.neusoft.coursemall.courses.service.CourseAttrService;


@Service("courseAttrService")
public class CourseAttrServiceImpl extends ServiceImpl<CourseAttrDao, CourseAttrEntity> implements CourseAttrService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CourseAttrEntity> page = this.page(
                new Query<CourseAttrEntity>().getPage(params),
                new QueryWrapper<CourseAttrEntity>()
        );

        return new PageUtils(page);
    }

}