package com.neusoft.coursemall.courses.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.coursemall.courses.entity.CourseCategoryEntity;

import java.util.Map;

/**
 * 课程的分类:可以是小学初中高中大学
 *
 * @author zhangyao
 * @email zhangyao1627@gmail.com
 * @date 2022-07-08 09:38:26
 */
public interface CourseCategoryService extends IService<CourseCategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

