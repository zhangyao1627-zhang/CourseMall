package com.neusoft.coursemall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.coursemall.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author zhangyao
 * @email zhangyao1627@gmail.com
 * @date 2022-07-08 09:01:30
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

