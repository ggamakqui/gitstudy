package com.koreait.fcs.dao;

import java.util.ArrayList;

import com.koreait.fcs.dto.CategoryDTO;

public interface CategoryDAO {
	
	// 1. 카테고리 삽입
	public int insertCategory(int cNo, String cName);
	
	// 2. 카테고리 수정
	public int updateCategory(int cNo, String cName);
	
	// 3. 카테고리 삭제
	public int deleteCategory(int cNo);
	
	// 4. 카테고리 목록 불러오기
	public ArrayList<CategoryDTO> selectCategoryList();
	
}
