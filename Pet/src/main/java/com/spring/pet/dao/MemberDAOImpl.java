package com.spring.pet.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.pet.dto.MemberDto;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Inject SqlSession sql;
	
	// 회원가입
	@Override
	public void register(MemberDto dto) throws Exception {
		sql.insert("member.register", dto);
	}
	
	//로그인
	@Override
	public MemberDto login(MemberDto dto) throws Exception {
		return sql.selectOne("member.login", dto);
	}
	
	//회원정보수정
	@Override
	public void memberUpdate(MemberDto dto) throws Exception {
		sql.update("member.memberUpdate", dto); 
	}
	
	// 회원 탈퇴
	@Override
	public void memberDelete(MemberDto dto) throws Exception {
		sql.delete("member.memberDelete", dto);
	}
	
	// 패스워드 체크
	@Override
	public int passChk(MemberDto dto) throws Exception {
		int result = sql.selectOne("member.passChk", dto);
		return result;
	}
	
	// 아이디 중복 체크
	@Override
	public int idChk(MemberDto dto) throws Exception {
		int result = sql.selectOne("member.idChk", dto);
		return result;
	}

}
