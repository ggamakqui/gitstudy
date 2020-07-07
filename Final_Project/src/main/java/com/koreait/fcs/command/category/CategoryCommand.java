package com.koreait.fcs.command.category;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

public interface CategoryCommand {
	
	public void execute(SqlSession sqlSession, Model model);
}
