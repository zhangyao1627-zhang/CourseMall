package com.neusoft.coursemall.coupon.dao;

import com.neusoft.coursemall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author zhangyao
 * @email zhangyao1627@gmail.com
 * @date 2022-07-08 09:01:30
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
