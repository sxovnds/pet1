package com.spring.pet.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.spring.pet.dao.MemberDAO;
import com.spring.pet.dto.MemberDto;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Inject MemberDAO dao;
	
	//회원가입
	@Override
	public void register(MemberDto dto) throws Exception {
		dao.register(dto);	
	}
	
	//로그인
	@Override
	public MemberDto login(MemberDto dto) throws Exception {
		return dao.login(dto);
	}
	
	//회원정보수정
	@Override
	public void memberUpdate(MemberDto dto) throws Exception {
		dao.memberUpdate(dto);
	}
	
	//회원탈퇴
	@Override
	public void memberDelete(MemberDto dto) throws Exception {
		dao.memberDelete(dto);
	}
	
	// 패스워드 체크
	@Override
	public int passChk(MemberDto dto) throws Exception {
		int result = dao.passChk(dto);
		return result;
	}
	
	// 아이디 중복 체크
	@Override
	public int idChk(MemberDto dto) throws Exception {
		int result = dao.idChk(dto);
		return result;
	}

}
