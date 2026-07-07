package com.hjh.batis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hjh.batis.model.Member;

@Mapper
public interface MyMapper {
	List<Member> selectMember();

	void insertMember(Member member);
}
