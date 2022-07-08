package com.neusoft.coursemall.courses.dao;

import com.neusoft.coursemall.courses.entity.CourseSkuInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 主要是sku的相关描述
 * 
 * @author zhangyao
 * @email zhangyao1627@gmail.com
 * @date 2022-07-08 09:38:26
 */
@Mapper
public interface CourseSkuInfoDao extends BaseMapper<CourseSkuInfoEntity> {
	
}
