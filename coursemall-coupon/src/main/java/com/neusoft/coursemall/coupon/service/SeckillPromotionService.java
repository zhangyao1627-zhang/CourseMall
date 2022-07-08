package com.neusoft.coursemall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.coursemall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author zhangyao
 * @email zhangyao1627@gmail.com
 * @date 2022-07-08 09:01:30
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

