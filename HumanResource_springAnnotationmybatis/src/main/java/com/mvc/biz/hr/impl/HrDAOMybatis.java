package com.mvc.biz.hr.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.biz.hr.HrVO;


@Repository
public class HrDAOMybatis{
	
	@Autowired
	private SqlSessionTemplate mybatis;

	public void insertHr(HrVO vo) {
		System.out.println("===> Mybatis로 insertHr() 기능 처리");
		mybatis.insert("HrDAO.insertHr", vo);
	}

	public void updateHr(HrVO vo) {
		System.out.println("===> Mybatis로 updateHr() 기능 처리");
		mybatis.update("HrDAO.updateHr", vo);
	}

	public void deleteHr(HrVO vo) {
		System.out.println("===> Mybatis로 deleteHr() 기능 처리");
		mybatis.delete("HrDAO.deleteHr", vo);
	}

	public HrVO getHr(HrVO vo) {
		System.out.println("===> Mybatis로 getHr() 기능 처리");
		return (HrVO) mybatis.selectOne("HrDAO.getHr", vo);
	}

	public List<HrVO> getHrList(HrVO vo) {
		System.out.println("===> Mybatis로 getHrList() 기능 처리");
		return mybatis.selectList("HrDAO.getHrList", vo);
	}
}