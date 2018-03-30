package com.czl.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;

import com.czl.bean.DocIndex;
import com.czl.bean.TransInfo;



@Controller   
@RequestMapping(value="/Htmls" ,produces="application/json;charset=UTF-8") 
public class FieldController {
	@RequestMapping("/transjson")  
	public @ResponseBody TransInfo transTest(String index) {
	   //page是页数,Size是记录总数,index是点击的页码
		System.out.println(index);

		TransInfo tt=new TransInfo();
		tt.setTotalSize(7);
		tt.setTotalPage(250);
		//添加文件记录，单页最多25个  ,例子
		List<DocIndex> docIndexs=new ArrayList<DocIndex>();
		for(int i=0;i<8;i++){
			DocIndex DI=new DocIndex();
			DI.setId("Did"+(i+1));
			DI.setTitle("标题"+(i+1));
			docIndexs.add(DI);
		}

		tt.setDocIndexs(docIndexs);
		return tt;
	}

	@RequestMapping("/test")
	public @ResponseBody void test() {
		//page是页数,Size是记录总数,index是点击的页码
		System.out.println("123123123213213");
	}


}
