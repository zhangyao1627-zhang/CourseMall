package com.neusoft.coursemall.courses.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.coursemall.courses.entity.CourseAttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author zhangyao
 * @email zhangyao1627@gmail.com
 * @date 2022-07-08 09:38:26
 */
public interface CourseAttrAttrgroupRelationService extends IService<CourseAttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

