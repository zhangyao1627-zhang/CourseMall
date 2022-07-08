package com.neusoft.coursemall.courses.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.common.utils.Query;

import com.neusoft.coursemall.courses.dao.CourseSkuInfoDao;
import com.neusoft.coursemall.courses.entity.CourseSkuInfoEntity;
import com.neusoft.coursemall.courses.service.CourseSkuInfoService;


@Service("courseSkuInfoService")
public class CourseSkuInfoServiceImpl extends ServiceImpl<CourseSkuInfoDao, CourseSkuInfoEntity> implements CourseSkuInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CourseSkuInfoEntity> page = this.page(
                new Query<CourseSkuInfoEntity>().getPage(params),
                new QueryWrapper<CourseSkuInfoEntity>()
        );

        return new PageUtils(page);
    }

}