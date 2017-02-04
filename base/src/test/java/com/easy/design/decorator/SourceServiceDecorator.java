package com.easy.design.decorator;

import com.easy.design.SourceService;

/**
 * 
 * @Title: SourceServiceObjectAdapter.java 
 * @Package com.easy.design.adapter 
 * @Description: 装饰模式
 * @author caiJunJun
 * @date 2017年2月4日
 *
 */
public class SourceServiceDecorator  {


	private SourceService sourceService;
	
	public SourceServiceDecorator(SourceService sourceService) {
		super();
		//同代理模式的区别这里在编译的时候是不可知的
		this.sourceService=sourceService;
	}
	
	public void printPower() {
		System.out.println(1);
		sourceService.print();
		System.out.println(2);
	}


}
