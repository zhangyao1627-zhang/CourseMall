package com.neusoft.coursemall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.coursemall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author zhangyao
 * @email zhangyao1627@gmail.com
 * @date 2022-07-08 09:55:15
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

