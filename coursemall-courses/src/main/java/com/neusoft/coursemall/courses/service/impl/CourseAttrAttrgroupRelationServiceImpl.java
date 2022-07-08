package com.neusoft.coursemall.courses.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.common.utils.Query;

import com.neusoft.coursemall.courses.dao.CourseAttrAttrgroupRelationDao;
import com.neusoft.coursemall.courses.entity.CourseAttrAttrgroupRelationEntity;
import com.neusoft.coursemall.courses.service.CourseAttrAttrgroupRelationService;


@Service("courseAttrAttrgroupRelationService")
public class CourseAttrAttrgroupRelationServiceImpl extends ServiceImpl<CourseAttrAttrgroupRelationDao, CourseAttrAttrgroupRelationEntity> implements CourseAttrAttrgroupRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CourseAttrAttrgroupRelationEntity> page = this.page(
                new Query<CourseAttrAttrgroupRelationEntity>().getPage(params),
                new QueryWrapper<CourseAttrAttrgroupRelationEntity>()
        );

        return new PageUtils(page);
    }

}