package com.springboot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HashTags {
	@Autowired
	TagsRepo repo;
	@RequestMapping("/")
	public ModelAndView homepage(Model model,HttpServletRequest request) {
		ModelAndView mv= new ModelAndView();
		HashMap<String, String>map=new HashMap<>();
	//	map=(HashMap) repo.findTopTen();
		List<HashtagsDtls> list=repo.getTopTen();
	//	System.out.println("map :"+map);
		Iterator<HashtagsDtls> itr=list.iterator();
		while (itr.hasNext()) {
			HashtagsDtls hashtagsDtls = (HashtagsDtls) itr.next();
			System.out.println("hashtag :"+hashtagsDtls.getHashTag()+"Count :"+hashtagsDtls.getCount());
			map.put(hashtagsDtls.getHashTag(), hashtagsDtls.getCount());
		}
		System.out.println(map);
		mv.addObject("Msg","Top 10 Hashtags");
		request.setAttribute("HashTagsMap", map);
		mv.setViewName("home");
		return mv;
	}

}
