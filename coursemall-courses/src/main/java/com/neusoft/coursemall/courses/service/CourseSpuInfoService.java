package com.neusoft.coursemall.courses.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.coursemall.courses.entity.CourseSpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author zhangyao
 * @email zhangyao1627@gmail.com
 * @date 2022-07-08 09:38:26
 */
public interface CourseSpuInfoService extends IService<CourseSpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

