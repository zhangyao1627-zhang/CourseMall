package com.neusoft.coursemall.order.dao;

import com.neusoft.coursemall.order.entity.OrderReturnReasonEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 * 
 * @author zhangyao
 * @email zhangyao1627@gmail.com
 * @date 2022-07-08 10:36:28
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReasonEntity> {
	
}
