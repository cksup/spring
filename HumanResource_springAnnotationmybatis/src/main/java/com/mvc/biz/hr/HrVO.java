package com.mvc.biz.hr;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

//VO(Value Object)
public class HrVO {
	private int seq;
	private String name;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private String sbirt;
	private Date birt;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private String shrdt;
	private Date hrdt;
	private String sung;
	private String addr;
	private String tele;
	private String dept;
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirt() {
		return birt;
	}
	public void setBirt(Date birt) {
		this.birt = birt;
	}
	public Date getHrdt() {
		return hrdt;
	}
	public void setHrdt(Date hrdt) {
		this.hrdt = hrdt;
	}
	public String getSung() {
		return sung;
	}
	public void setSung(String sung) {
		this.sung = sung;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTele() {
		return tele;
	}
	public void setTele(String tele) {
		this.tele = tele;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "HrVO [seq=" + seq + ", name=" + name + ", birt=" + birt + ", hrdt=" + hrdt + ", sung=" + sung
				+ ", addr=" + addr + ", tele=" + tele + ", dept=" + dept + "]";
	}
	public String getSbirt() {
		return sbirt;
	}
	public void setSbirt(String sbirt) {
		this.sbirt = sbirt;
	}
	public String getShrdt() {
		return shrdt;
	}
	public void setShrdt(String shrdt) {
		this.shrdt = shrdt;
	}
}