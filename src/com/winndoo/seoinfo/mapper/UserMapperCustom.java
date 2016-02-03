package com.winndoo.seoinfo.mapper;

import com.winndoo.seoinfo.po.User;

public interface UserMapperCustom {
	public User findUserByNickname(String nikename) throws Exception;
}
