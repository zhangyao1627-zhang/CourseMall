package com.neusoft.coursemall.courses.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.common.utils.Query;

import com.neusoft.coursemall.courses.dao.CourseSkuSaleAttrValueDao;
import com.neusoft.coursemall.courses.entity.CourseSkuSaleAttrValueEntity;
import com.neusoft.coursemall.courses.service.CourseSkuSaleAttrValueService;


@Service("courseSkuSaleAttrValueService")
public class CourseSkuSaleAttrValueServiceImpl extends ServiceImpl<CourseSkuSaleAttrValueDao, CourseSkuSaleAttrValueEntity> implements CourseSkuSaleAttrValueService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CourseSkuSaleAttrValueEntity> page = this.page(
                new Query<CourseSkuSaleAttrValueEntity>().getPage(params),
                new QueryWrapper<CourseSkuSaleAttrValueEntity>()
        );

        return new PageUtils(page);
    }

}