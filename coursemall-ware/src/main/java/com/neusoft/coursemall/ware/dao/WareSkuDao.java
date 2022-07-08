package com.neusoft.coursemall.ware.dao;

import com.neusoft.coursemall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author zhangyao
 * @email zhangyao1627@gmail.com
 * @date 2022-07-08 10:51:31
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
