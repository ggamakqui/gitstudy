package com.koreait.fcs.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.koreait.fcs.command.category.CategoryCommand;
import com.koreait.fcs.command.category.CategoryDeleteCommand;
import com.koreait.fcs.command.category.CategoryInsertCommand;
import com.koreait.fcs.command.category.CategoryListCommand;
import com.koreait.fcs.command.category.CategoryUpdateCommand;

@Controller
public class CategoryController {
	
	// Field
	@Autowired
	private SqlSession sqlSession;
	
	private CategoryCommand categoryCommand;
	
	@RequestMapping("/")
	public String goIndex() {
		return "index";
	}
	
	@RequestMapping("categoryListPage")
	public String categoryListPage(Model model) {
		categoryCommand = new CategoryListCommand();
		categoryCommand.execute(sqlSession, model);
		return "category/categoryListPage";
	}
	
	
	@RequestMapping("insertCategory")
	public String insertCategory(RedirectAttributes rttr, HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		model.addAttribute("rttr", rttr);
		categoryCommand = new CategoryInsertCommand();
		categoryCommand.execute(sqlSession, model);
		return "redirect:categoryListPage";
	}
	

	
	@RequestMapping("updateCategory")
	public String updateCategory(RedirectAttributes rttr, HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		model.addAttribute("rttr", rttr);
		categoryCommand = new CategoryUpdateCommand();
		categoryCommand.execute(sqlSession, model);
		return "redirect:categoryListPage";
	}
	
	@RequestMapping("updateCategoryPage")
	public String updateCategoryPage() {
		return "category/updateCategoryPage";
	}
	
	@RequestMapping("deleteCategory")
	public String deleteCategory(RedirectAttributes rttr, HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		model.addAttribute("rttr", rttr);
		categoryCommand = new CategoryDeleteCommand();
		categoryCommand.execute(sqlSession, model);
		return "redirect:categoryListPage";
	}
}
