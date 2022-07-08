package com.neusoft.coursemall.courses.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.common.utils.Query;

import com.neusoft.coursemall.courses.dao.CourseSpuInfoDescDao;
import com.neusoft.coursemall.courses.entity.CourseSpuInfoDescEntity;
import com.neusoft.coursemall.courses.service.CourseSpuInfoDescService;


@Service("courseSpuInfoDescService")
public class CourseSpuInfoDescServiceImpl extends ServiceImpl<CourseSpuInfoDescDao, CourseSpuInfoDescEntity> implements CourseSpuInfoDescService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CourseSpuInfoDescEntity> page = this.page(
                new Query<CourseSpuInfoDescEntity>().getPage(params),
                new QueryWrapper<CourseSpuInfoDescEntity>()
        );

        return new PageUtils(page);
    }

}