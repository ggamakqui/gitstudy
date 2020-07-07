package com.koreait.fcs.command.category;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.koreait.fcs.dao.CategoryDAO;

public class CategoryDeleteCommand implements CategoryCommand {

	@Override
	public void execute(SqlSession sqlSession, Model model) {
		
		Map<String, Object> map = model.asMap();
		RedirectAttributes rttr = (RedirectAttributes)map.get("rttr");
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		
		int cNo = Integer.parseInt(request.getParameter("cNo"));
		
		CategoryDAO cDAO = sqlSession.getMapper(CategoryDAO.class);
		// 삭제 결과를 redirect로 넘기기 때문에
		// model을 이용하면 중간에 넘긴 값이 사라진다.
		// 그래서 model 대신 rttr을 사용한다.
		rttr.addFlashAttribute("deleteResult", cDAO.deleteCategory(cNo));
		// 삭제 결과를 categoryListPage.jsp에 넘기는데, 삭제 후에만 categoryListPage.jsp 에서 삭제 결과를 검사할 수 있도록
		// 삭제 후에 이동한 것이라는 "변수"를 하나 더 넘겨준다.
		rttr.addFlashAttribute("beUpdated", true);

	}

}
