package com.neusoft.coursemall.courses.dao;

import com.neusoft.coursemall.courses.entity.CourseAttrGroupEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 课程属性分组:到时候可以分下是哪个单位制作的
 * 
 * @author zhangyao
 * @email zhangyao1627@gmail.com
 * @date 2022-07-08 09:38:26
 */
@Mapper
public interface CourseAttrGroupDao extends BaseMapper<CourseAttrGroupEntity> {
	
}
