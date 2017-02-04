package com.easy.design.adapter;

import com.easy.design.SourceService;

/**
 * 
 * @Title: SourceServiceObjectAdapter.java 
 * @Package com.easy.design.adapter 
 * @Description: 对象适配器
 * @author caiJunJun
 * @date 2017年2月4日
 *
 */
public class SourceServiceObjectAdapterImpl implements SourceServiceAdapter {


	private SourceService sourceService;
	
	public SourceServiceObjectAdapterImpl(SourceService sourceService) {
		super();
		this.sourceService=sourceService;
	}
	

	@Override
	public void print() {
		sourceService.print();
		
	}

	@Override
	public void send() {
		System.out.println("SourceServiceDecoratorImpl send");
		
	}

}
