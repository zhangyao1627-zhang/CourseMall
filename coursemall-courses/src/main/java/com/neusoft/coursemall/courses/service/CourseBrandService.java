package com.neusoft.coursemall.courses.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.coursemall.courses.entity.CourseBrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author zhangyao
 * @email zhangyao1627@gmail.com
 * @date 2022-07-08 09:38:26
 */
public interface CourseBrandService extends IService<CourseBrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

