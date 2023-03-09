package com.mvc.view.hr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.biz.hr.HrVO;
import com.mvc.biz.hr.impl.HrDAOMybatis;

@Controller
public class GetHrController{
	@Autowired
	private HrDAOMybatis hrDAO;
	@RequestMapping("/getHr.do")
	public ModelAndView getHr(HrVO vo, ModelAndView mav) {
		System.out.println("글 상세 조회 처리");

		mav.addObject("hr", hrDAO.getHr(vo));
		mav.setViewName("getHr.jsp");
		return mav;
	}
}
