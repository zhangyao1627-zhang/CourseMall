package com.neusoft.coursemall.courses.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.coursemall.courses.entity.CourseAttrGroupEntity;

import java.util.Map;

/**
 * 课程属性分组:到时候可以分下是哪个单位制作的
 *
 * @author zhangyao
 * @email zhangyao1627@gmail.com
 * @date 2022-07-08 09:38:26
 */
public interface CourseAttrGroupService extends IService<CourseAttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

