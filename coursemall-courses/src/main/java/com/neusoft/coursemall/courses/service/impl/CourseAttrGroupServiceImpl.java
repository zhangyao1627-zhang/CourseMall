package com.neusoft.coursemall.courses.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.common.utils.Query;

import com.neusoft.coursemall.courses.dao.CourseAttrGroupDao;
import com.neusoft.coursemall.courses.entity.CourseAttrGroupEntity;
import com.neusoft.coursemall.courses.service.CourseAttrGroupService;


@Service("courseAttrGroupService")
public class CourseAttrGroupServiceImpl extends ServiceImpl<CourseAttrGroupDao, CourseAttrGroupEntity> implements CourseAttrGroupService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CourseAttrGroupEntity> page = this.page(
                new Query<CourseAttrGroupEntity>().getPage(params),
                new QueryWrapper<CourseAttrGroupEntity>()
        );

        return new PageUtils(page);
    }

}