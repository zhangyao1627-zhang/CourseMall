package com.neusoft.coursemall.member.dao;

import com.neusoft.coursemall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zhangyao
 * @email zhangyao1627@gmail.com
 * @date 2022-07-08 09:55:16
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
