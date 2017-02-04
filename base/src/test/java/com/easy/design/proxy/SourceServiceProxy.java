package com.easy.design.proxy;

import com.easy.design.SourceService;
import com.easy.design.SourceServiceImpl;

public class SourceServiceProxy implements SourceService {
	private SourceService sourceService;
	public SourceServiceProxy() {
		super();
		//同装饰模式区别是这里是在编译的时候就确定的
		sourceService=new SourceServiceImpl();
	}

	@Override
	public void print() {
		System.out.println(11);
		sourceService.print();
		System.out.println(22);
	}

}
