package com.koreait.fcs.dto;

import java.sql.Date;

public class ProductDTO {
	
	// Field
	private int pNo, pPrice, pCategory, pGender, pStock;
	private String pName, pSize, pCompany, pThumbnail, pFilename, pDescription;
	private Date pRegdate;
	
	// Constructor
	public ProductDTO() {
		// TODO Auto-generated constructor stub
	}

	public ProductDTO(int pNo, int pPrice, int pCategory, int pGender, int pStock, String pName, String pSize,
			String pCompany, String pThumbnail, String pFilename, String pDescription, Date pRegdate) {
		super();
		this.pNo = pNo;
		this.pPrice = pPrice;
		this.pCategory = pCategory;
		this.pGender = pGender;
		this.pStock = pStock;
		this.pName = pName;
		this.pSize = pSize;
		this.pCompany = pCompany;
		this.pThumbnail = pThumbnail;
		this.pFilename = pFilename;
		this.pDescription = pDescription;
		this.pRegdate = pRegdate;
	}
	
	// Method
	public int getpNo() {
		return pNo;
	}

	public void setpNo(int pNo) {
		this.pNo = pNo;
	}

	public int getpPrice() {
		return pPrice;
	}

	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}

	public int getpCategory() {
		return pCategory;
	}

	public void setpCategory(int pCategory) {
		this.pCategory = pCategory;
	}

	public int getpGender() {
		return pGender;
	}

	public void setpGender(int pGender) {
		this.pGender = pGender;
	}

	public int getpStock() {
		return pStock;
	}

	public void setpStock(int pStock) {
		this.pStock = pStock;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpSize() {
		return pSize;
	}

	public void setpSize(String pSize) {
		this.pSize = pSize;
	}

	public String getpCompany() {
		return pCompany;
	}

	public void setpCompany(String pCompany) {
		this.pCompany = pCompany;
	}

	public String getpThumbnail() {
		return pThumbnail;
	}

	public void setpThumbnail(String pThumbnail) {
		this.pThumbnail = pThumbnail;
	}

	public String getpFilename() {
		return pFilename;
	}

	public void setpFilename(String pFilename) {
		this.pFilename = pFilename;
	}

	public String getpDescription() {
		return pDescription;
	}

	public void setpDescription(String pDescription) {
		this.pDescription = pDescription;
	}

	public Date getpRegdate() {
		return pRegdate;
	}

	public void setpRegdate(Date pRegdate) {
		this.pRegdate = pRegdate;
	}
	
	
	
}
