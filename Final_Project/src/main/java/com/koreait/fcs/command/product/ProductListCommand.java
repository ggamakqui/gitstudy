package com.koreait.fcs.command.product;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.koreait.fcs.dao.ProductDAO;
import com.koreait.fcs.dto.ProductDTO;

public class ProductListCommand implements ProductCommand {

	@Override
	public void execute(SqlSession sqlSession, Model model) {
		
		ProductDAO pDAO = sqlSession.getMapper(ProductDAO.class);
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		int cNo = Integer.parseInt(request.getParameter("cNo"));	// 카테고리 번호를 통한 검색
		ArrayList<ProductDTO> list = pDAO.selectProductListByCategory(cNo);
		model.addAttribute("list", list);
		model.addAttribute("totalCount", list.size());
	}

}
