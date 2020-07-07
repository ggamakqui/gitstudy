package com.koreait.fcs.dto;

public class CategoryDTO {
	private int cNo;
	private String cName;
	
	public CategoryDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public CategoryDTO(int cNo, String cName) {
		super();
		this.cNo = cNo;
		this.cName = cName;
	}



	public int getcNo() {
		return cNo;
	}

	public void setcNo(int cNo) {
		this.cNo = cNo;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}
	
	
}
