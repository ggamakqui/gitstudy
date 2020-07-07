package com.koreait.fcs.dao;

import java.util.ArrayList;

import com.koreait.fcs.dto.ProductDTO;

public interface ProductDAO {
	
	// 카테고리별 product 목록 불러오기
	public ArrayList<ProductDTO> selectProductListByCategory(int cNo);
	
	// 번호별 product 불러오기
	
	
	// product 추가하기
	public int insertProduct();
	
	// product 수정하기
	public int updateProduct();
	
	// product 삭제하기
	public int deleteProduct();
}
