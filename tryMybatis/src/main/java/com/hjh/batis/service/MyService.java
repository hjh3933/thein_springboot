package com.hjh.batis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hjh.batis.mapper.MyMapper;
import com.hjh.batis.model.Member;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MyService {
	private final MyMapper myMapper;

	public List<Member> selectMember() {
		return myMapper.selectMember();
	}

	public void insertMember(Member member) {
		myMapper.insertMember(member);
	}
}
