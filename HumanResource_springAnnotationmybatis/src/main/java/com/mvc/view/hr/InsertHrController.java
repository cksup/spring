package com.mvc.view.hr;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.biz.hr.HrVO;
import com.mvc.biz.hr.impl.HrDAOMybatis;

@Controller
public class InsertHrController {
	@Autowired
	private HrDAOMybatis hrDAO;
	@RequestMapping(value="/insertHr.do")
	public String insertBoard(HrVO vo) {
		System.out.println("글 등록 처리");

		Date birt = null;
		Date hrdt = null;
		try {
			String sbirt = vo.getSbirt();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			birt = sdf.parse(sbirt);
			vo.setBirt(birt);

			String shrdt = vo.getShrdt();
			hrdt = sdf.parse(shrdt);
			vo.setHrdt(hrdt);
		} catch (Exception e) {
			// TODO: handle exception
		}
		hrDAO.insertHr(vo);
		return "getHrList.do";
	}
}