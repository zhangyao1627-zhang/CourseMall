package com.neusoft.coursemall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.coursemall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author zhangyao
 * @email zhangyao1627@gmail.com
 * @date 2022-07-08 10:51:31
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

