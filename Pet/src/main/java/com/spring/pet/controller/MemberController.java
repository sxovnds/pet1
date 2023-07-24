package com.spring.pet.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.pet.dto.MemberDto;
import com.spring.pet.service.MemberService;

@Controller
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
		@Inject
		MemberService service;
		
		//마이페이지
		@RequestMapping(value = "/member/mypage", method = RequestMethod.GET)
		public String mypage(Model model) {
			
			return "/member/mypage";
		}
	
		// 회원가입 get
		@RequestMapping(value = "/member/register", method = RequestMethod.GET)
		public void getRegister() throws Exception {
			logger.info("get register");
		}
		
		// 아이디 중복 체크
		@ResponseBody
		@RequestMapping(value="/member/idChk", method = RequestMethod.POST)
		public int idChk(MemberDto dto) throws Exception {
			int result = service.idChk(dto);
			return result;
		}
		
		// 회원가입 post
		@RequestMapping(value = "/member/register", method = RequestMethod.POST)
		public String postRegister(MemberDto dto) throws Exception {
			logger.info("post register");
			int result = service.idChk(dto);
			try {
				if(result == 1) {
					return "/member/register";
				}else if(result == 0) {
					service.register(dto);
				}
				// 요기에서~ 입력된 아이디가 존재한다면 -> 다시 회원가입 페이지로 돌아가기 
				// 존재하지 않는다면 -> register
			} catch (Exception e) {
				throw new RuntimeException();
			}
			return "redirect:/";
		}
		
		// 로그인 get
		@RequestMapping(value = "/member/login", method = RequestMethod.GET)
		public void getLogin() throws Exception {
			logger.info("get login");
		}
		
		//로그인 POST
		@RequestMapping(value = "/member/login", method = RequestMethod.POST)
		public String postLogin(MemberDto dto, HttpServletRequest req, RedirectAttributes rttr) throws Exception{
			logger.info("post login");
			
			HttpSession session = req.getSession();
			MemberDto login = service.login(dto);
			
			if(login == null) {
				session.setAttribute("member", null);
				rttr.addFlashAttribute("msg", false);
			}else {
				session.setAttribute("member", login);
				session.setAttribute("userName", login.getUserName()); // userName을 세션에 저장
			}
			
			return "redirect:/";
		}
		
		//로그아웃
		@RequestMapping(value = "/member/logout", method = RequestMethod.GET)
		public String logout(HttpSession session) throws Exception{
			
			session.invalidate();
			
			return "redirect:/";
		}
		
		//회원정보수정
		@RequestMapping(value="/member/memberUpdateView", method = RequestMethod.GET)
		public String registerUpdateView() throws Exception{
			
			return "member/memberUpdateView";
		}
		
		//회원정보수정
		@RequestMapping(value="/member/memberUpdate", method = RequestMethod.POST)
		public String registerUpdate(MemberDto dto, HttpSession session) throws Exception{
			
			service.memberUpdate(dto);
			session.invalidate();
			
			return "redirect:/";
		}
		
		// 회원 탈퇴 get
		@RequestMapping(value="/member/memberDeleteView", method = RequestMethod.GET)
		public String memberDeleteView() throws Exception{
			return "member/memberDeleteView";
		}
		
		// 회원 탈퇴 post
		@RequestMapping(value="/member/memberDelete", method = RequestMethod.POST)
		public String memberDelete(MemberDto dto, HttpSession session, RedirectAttributes rttr) throws Exception{
			service.memberDelete(dto);
			session.invalidate();
			return "redirect:/";
		}
		
		// 패스워드 체크
		@ResponseBody
		@RequestMapping(value="/member/passChk", method = RequestMethod.POST)
		public int passChk(MemberDto dto) throws Exception {
			int result = service.passChk(dto);
			return result;
		}
		

}
