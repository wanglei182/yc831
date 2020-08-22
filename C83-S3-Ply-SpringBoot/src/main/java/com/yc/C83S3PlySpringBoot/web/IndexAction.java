package com.yc.C83S3PlySpringBoot.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yc.C83S3PlySpringBoot.dao.ProductMapper;
import com.yc.damai.bean.DmProduct;

@Controller
public class IndexAction {
	
	
	@Resource
	ProductMapper pm;
	
	@GetMapping("index.do")
	public String index(Model m) {
		
		List<DmProduct> hlist=pm.selectByHot();
		
		List<DmProduct> nlist=pm.selectByNew();
		
		m.addAttribute("hlist",hlist);
		m.addAttribute("nlist",nlist);
		return "index";
	}
	
	@GetMapping("detail.do")
	public String detail(Model m,int id) {
		
		DmProduct dp=pm.selectById(id);		
		
		m.addAttribute("dp",dp);
		return "detail";
	}
	
	

}
