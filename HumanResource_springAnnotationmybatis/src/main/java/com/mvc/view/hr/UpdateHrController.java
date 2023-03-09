package com.mvc.view.hr;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.biz.hr.HrVO;
import com.mvc.biz.hr.impl.HrDAOMybatis;

@Controller
public class UpdateHrController {
	@Autowired
	private HrDAOMybatis hrDAO;
	@RequestMapping("/updateHr.do")
	public String updateHr(HrVO vo) {
		System.out.println("글 수정 처리");
		// 1. ����� �Է� ���� ����
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
		hrDAO.updateHr(vo);
		return "getHrList.do";
	}
}