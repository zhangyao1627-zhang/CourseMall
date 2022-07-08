package com.neusoft.coursemall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.coursemall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author zhangyao
 * @email zhangyao1627@gmail.com
 * @date 2022-07-08 09:55:16
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

