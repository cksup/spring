package com.mvc.view.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.biz.user.UserVO;
import com.mvc.biz.user.impl.UserDAO;

@Controller
public class LoginController {
	@RequestMapping("/login.do")
	public String login(UserVO vo, UserDAO userDAO) {
		System.out.println("로그인 처리");
		// 1. ����� �Է� ���� ����
		if(userDAO.getUser(vo) != null) return "getHrList.do";
		else return "login.jsp";
	}
}
