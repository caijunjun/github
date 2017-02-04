package com.easy.design.adapter;
/**
 * 
 * @Title: ClassAdapterTest.java 
 * @Package com.easy.design.adapter 
 * @Description: 类适配器模式
 * @author caiJunJun
 * @date 2017年2月4日
 *
 */
public class AdapterTest {
	public static void main(String[] args) {
		//原有方法实现
		SourceService ss=new SourceServiceImpl();
		ss.print();
		
		//类适配器创建
		SourceServiceAdapter ssAdapter=new SourceServiceClassAdapterImpl();
		ssAdapter.print();
		ssAdapter.send();
		
		//对象适配器创建
		SourceServiceAdapter ssObjectAdapter=new SourceServiceObjectAdapterImpl(ss);
		ssObjectAdapter.print();
		ssObjectAdapter.send();
		
		//接口适配器创建
		SourceServiceAdapter sspAdapter=new SourceServiceInterfacePrintAdapterImpl();
		SourceServiceAdapter sssAdapter=new SourceServiceInterfaceSendAdapterImpl();
		sspAdapter.print();
		sssAdapter.send();
	}
}
