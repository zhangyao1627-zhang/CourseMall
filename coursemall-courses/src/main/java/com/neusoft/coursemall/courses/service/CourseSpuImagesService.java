package com.neusoft.coursemall.courses.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.coursemall.courses.entity.CourseSpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author zhangyao
 * @email zhangyao1627@gmail.com
 * @date 2022-07-08 09:38:26
 */
public interface CourseSpuImagesService extends IService<CourseSpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

