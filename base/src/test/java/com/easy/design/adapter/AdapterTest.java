package com.easy.design.adapter;
/**
 * 
 * @Title: AdapterTest.java 
 * @Package com.easy.design.adapter 
 * @Description: 类适配器模式
 * @author caiJunJun
 * @date 2017年2月4日
 *
 */
public class AdapterTest {
	public static void main(String[] args) {
		SourceService ss=new SourceServiceImpl();
		ss.print();
		
		SourceServiceAdapter ssAdapter=new SourceServiceAdapterImpl();
		ssAdapter.print();
		ssAdapter.send();
	}
}
