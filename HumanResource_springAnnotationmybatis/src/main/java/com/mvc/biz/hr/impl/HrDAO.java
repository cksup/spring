package com.mvc.biz.hr.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.mvc.biz.common.JDBCUtil;
import com.mvc.biz.hr.HrVO;

// DAO(Data Access Object)
public class HrDAO {
	// JDBC ���� ����
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	// SQL ��ɾ��
	private final String HR_INSERT = "insert into hr (seq, name, birt, hrdt, sung, addr, tele, dept) values ((select nvl(max(seq), 0)+1 from hr),?,?,?,?,?,?,?)";
	private final String HR_UPDATE = "update hr set name=?, birt=?, hrdt=?, sung=?, addr=?, tele=?, dept=? where seq=?";
	private final String HR_DELETE = "delete hr where seq=?";
	private final String HR_GET = "select * from hr where seq=?";
	private final String HR_LIST = "select * from hr order by seq desc";

	// CRUD ����� �޼ҵ� ����
	// �� ���
	public void insertHr(HrVO vo) {
		System.out.println("===> JDBC�� insertHr() ��� ó��");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(HR_INSERT);
			stmt.setString(1, vo.getName());

	        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
	        String formattedDate = simpleDateFormat.format(vo.getBirt());
	        java.sql.Date date1 = java.sql.Date.valueOf(formattedDate);
	        stmt.setDate(2, date1);
	        
			String formattedDate1 = simpleDateFormat.format(vo.getHrdt());
	        java.sql.Date date2 = java.sql.Date.valueOf(formattedDate1);
	        stmt.setDate(3, date2);
			
			stmt.setString(4, vo.getSung());
			stmt.setString(5, vo.getAddr());
			stmt.setString(6, vo.getTele());
			stmt.setString(7, vo.getDept());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}
	}

	// �� ����
	public void updateHr(HrVO vo) {
		System.out.println("===> JDBC�� updateHr() ��� ó��");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(HR_UPDATE);
			stmt.setString(1, vo.getName());
			
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
	        String formattedDate = simpleDateFormat.format(vo.getBirt());
	        java.sql.Date date1 = java.sql.Date.valueOf(formattedDate);
	        stmt.setDate(2, date1);
	        
			String formattedDate1 = simpleDateFormat.format(vo.getHrdt());
	        java.sql.Date date2 = java.sql.Date.valueOf(formattedDate1);
	        stmt.setDate(3, date2);
	        
			stmt.setString(4, vo.getSung());
			stmt.setString(5, vo.getAddr());
			stmt.setString(6, vo.getTele());
			stmt.setString(7, vo.getDept());
			stmt.setInt(8, vo.getSeq());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}
	}

	// �� ����
	public void deleteHr(HrVO vo) {
		System.out.println("===> JDBC�� deleteHr() ��� ó��");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(HR_DELETE);
			stmt.setInt(1, vo.getSeq());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}
	}

	// �� �� ��ȸ
	public HrVO getHr(HrVO vo) {
		System.out.println("===> JDBC�� getHr() ��� ó��");
		HrVO hr = null;
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(HR_GET);
			stmt.setInt(1, vo.getSeq());
			rs = stmt.executeQuery();
			if (rs.next()) {
				hr = new HrVO();
				hr.setSeq(rs.getInt("SEQ"));
				hr.setName(rs.getString("NAME"));
				hr.setBirt(rs.getDate("BIRT"));
				hr.setHrdt(rs.getDate("HRDT"));
				hr.setSung(rs.getString("SUNG"));
				hr.setAddr(rs.getString("ADDR"));
				hr.setTele(rs.getString("TELE"));
				hr.setDept(rs.getString("DEPT"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, stmt, conn);
		}
		return hr;
	}

	// �� ��� ��ȸ
	public List<HrVO> getHrList(HrVO vo) {
		System.out.println("===> 2222JDBC�� getHrList() ��� ó��");
		List<HrVO> hrList = new ArrayList<HrVO>();
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(HR_LIST);
			rs = stmt.executeQuery();
			while (rs.next()) {
				HrVO hr = new HrVO();
				hr.setSeq(rs.getInt("SEQ"));
				hr.setName(rs.getString("NAME"));
				hr.setBirt(rs.getDate("BIRT"));
				hr.setHrdt(rs.getDate("HRDT"));
				hr.setSung(rs.getString("SUNG"));
				hr.setAddr(rs.getString("ADDR"));
				hr.setTele(rs.getString("TELE"));
				hr.setDept(rs.getString("DEPT"));

				hrList.add(hr);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, stmt, conn);
		}
		return hrList;
	}
}