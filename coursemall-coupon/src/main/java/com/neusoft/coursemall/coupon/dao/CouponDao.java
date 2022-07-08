package com.neusoft.coursemall.coupon.dao;

import com.neusoft.coursemall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zhangyao
 * @email zhangyao1627@gmail.com
 * @date 2022-07-08 09:01:30
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
