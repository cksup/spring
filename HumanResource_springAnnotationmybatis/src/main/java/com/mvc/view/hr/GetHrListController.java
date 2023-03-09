package com.mvc.view.hr;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.biz.hr.HrVO;
import com.mvc.biz.hr.impl.HrDAOMybatis;

@Controller
public class GetHrListController{
	@Autowired
	private HrDAOMybatis hrDAO;
	@RequestMapping("/getHrList.do")
	public ModelAndView handleRequest(HrVO vo, ModelAndView mav) {
		System.out.println("글 목록 검색 처리");
		mav.addObject("hrList", hrDAO.getHrList(vo));

		Date birt = null;
		Date hrdt = null;
		try {
			Date from = vo.getBirt();
			SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
			String to = transFormat.format(from);
			vo.setSbirt(to);
			String sbirt = vo.getSbirt();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			birt = sdf.parse(sbirt);
			vo.setBirt(birt); 
			

		} catch (Exception e) {
			// TODO: handle exception
		}
//		mav.addObject("hrList", hrDAO.getHrList(vo));
		mav.setViewName("getHrList.jsp");
		return mav;
	}
}
