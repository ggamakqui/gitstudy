

package com.koreait.fcs.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.koreait.fcs.command.product.ProductCommand;
import com.koreait.fcs.command.product.ProductListCommand;

@Controller
public class ProductController {
	// Field
		@Autowired
		private SqlSession sqlSession;
		
		private ProductCommand productCommand;
		
		
		@RequestMapping("/")
		public String goIndex() {
			return "index";
		}
		
		@RequestMapping("productUploadPage")
		public String goUploadPage() {
			return "productUploadPage";
		}
		
		
		@RequestMapping("productListPage")
		public String productListPage(Model model) {
			productCommand = new ProductListCommand();
			productCommand.execute(sqlSession, model);
			return "productListPage";
		}
		
		
		@RequestMapping(value="productUpload", method=RequestMethod.POST)
		public String multiUpload(MultipartHttpServletRequest mr, Model model) {
			
			// 1. 업로드 없는 경우 : HttpServletRequest request
			// 2. 업로드 있는 경우 : MultipartHttpServletRequest mr
			
			model.addAttribute("mr", mr);
			productCommand = new ProductUploadCommand();
			productCommand.execute(sqlSession, model);
			return "redirect:productListPage";
		}
		
		
		@RequestMapping(value="productUpdate", method=RequestMethod.POST)
		public void productUpdate(HttpServletRequest request, Model model) {
			model.addAttribute("request", request);
			productCommand = new ProductUpdateCommand();
			productCommand.execute(sqlSession, model);
		}
		
		@RequestMapping(value="productDelete", method=RequestMethod.POST)
		public String productDelete(HttpServletRequest request, Model model) {
			model.addAttribute("request", request);
			productCommand = new ProductDeleteCommand();
			productCommand.execute(sqlSession, model);
			return "redirect:productListPage";
		}
}

