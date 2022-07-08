package com.neusoft.coursemall.courses.dao;

import com.neusoft.coursemall.courses.entity.CourseCategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 课程的分类:可以是小学初中高中大学
 * 
 * @author zhangyao
 * @email zhangyao1627@gmail.com
 * @date 2022-07-08 09:38:26
 */
@Mapper
public interface CourseCategoryDao extends BaseMapper<CourseCategoryEntity> {
	
}
