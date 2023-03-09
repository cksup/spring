package com.mvc.view.hr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.biz.hr.HrVO;
import com.mvc.biz.hr.impl.HrDAOMybatis;

@Controller
public class DeleteHrController {
	@Autowired
	private HrDAOMybatis hrDAO;
	@RequestMapping("/deleteHr.do")
	public String deleteHr(HrVO vo) {
		System.out.println("글 삭제 처리");
		// 1. ����� �Է� ���� ����

		hrDAO.deleteHr(vo);
		return "getHrList.do";
	}
}