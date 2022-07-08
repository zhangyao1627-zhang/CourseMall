package com.neusoft.coursemall.courses.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.common.utils.Query;

import com.neusoft.coursemall.courses.dao.CourseBrandDao;
import com.neusoft.coursemall.courses.entity.CourseBrandEntity;
import com.neusoft.coursemall.courses.service.CourseBrandService;


@Service("courseBrandService")
public class CourseBrandServiceImpl extends ServiceImpl<CourseBrandDao, CourseBrandEntity> implements CourseBrandService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CourseBrandEntity> page = this.page(
                new Query<CourseBrandEntity>().getPage(params),
                new QueryWrapper<CourseBrandEntity>()
        );

        return new PageUtils(page);
    }

}