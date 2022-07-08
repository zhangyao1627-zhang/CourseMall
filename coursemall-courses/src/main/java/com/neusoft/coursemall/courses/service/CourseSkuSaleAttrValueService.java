package com.neusoft.coursemall.courses.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.coursemall.courses.entity.CourseSkuSaleAttrValueEntity;

import java.util.Map;

/**
 * 销售的一些信息:sku销售属性&值
 *
 * @author zhangyao
 * @email zhangyao1627@gmail.com
 * @date 2022-07-08 09:38:26
 */
public interface CourseSkuSaleAttrValueService extends IService<CourseSkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

