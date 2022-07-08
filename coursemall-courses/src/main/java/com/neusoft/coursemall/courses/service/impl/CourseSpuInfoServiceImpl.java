package com.neusoft.coursemall.courses.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.common.utils.Query;

import com.neusoft.coursemall.courses.dao.CourseSpuInfoDao;
import com.neusoft.coursemall.courses.entity.CourseSpuInfoEntity;
import com.neusoft.coursemall.courses.service.CourseSpuInfoService;


@Service("courseSpuInfoService")
public class CourseSpuInfoServiceImpl extends ServiceImpl<CourseSpuInfoDao, CourseSpuInfoEntity> implements CourseSpuInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CourseSpuInfoEntity> page = this.page(
                new Query<CourseSpuInfoEntity>().getPage(params),
                new QueryWrapper<CourseSpuInfoEntity>()
        );

        return new PageUtils(page);
    }

}