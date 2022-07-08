package com.neusoft.coursemall.courses.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.common.utils.Query;

import com.neusoft.coursemall.courses.dao.CourseAttrValueDao;
import com.neusoft.coursemall.courses.entity.CourseAttrValueEntity;
import com.neusoft.coursemall.courses.service.CourseAttrValueService;


@Service("courseAttrValueService")
public class CourseAttrValueServiceImpl extends ServiceImpl<CourseAttrValueDao, CourseAttrValueEntity> implements CourseAttrValueService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CourseAttrValueEntity> page = this.page(
                new Query<CourseAttrValueEntity>().getPage(params),
                new QueryWrapper<CourseAttrValueEntity>()
        );

        return new PageUtils(page);
    }

}