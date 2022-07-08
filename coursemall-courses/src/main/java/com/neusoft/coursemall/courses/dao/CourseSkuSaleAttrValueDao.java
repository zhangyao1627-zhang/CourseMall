package com.neusoft.coursemall.courses.dao;

import com.neusoft.coursemall.courses.entity.CourseSkuSaleAttrValueEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 销售的一些信息:sku销售属性&值
 * 
 * @author zhangyao
 * @email zhangyao1627@gmail.com
 * @date 2022-07-08 09:38:26
 */
@Mapper
public interface CourseSkuSaleAttrValueDao extends BaseMapper<CourseSkuSaleAttrValueEntity> {
	
}
