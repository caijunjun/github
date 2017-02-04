package com.easy.design.adapter;

import com.easy.design.SourceService;
import com.easy.design.SourceServiceImpl;

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
		
		//（扩展）类适配器创建(扩展别人的接口很有用)（当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，创建一个新类，继承原有的类，实现新的接口即可。）
		SourceServiceAdapter ssAdapter=new SourceServiceClassAdapterImpl();
		ssAdapter.print();
		ssAdapter.send();
		
		//（扩展）对象适配器创建(跟代理模式、装饰模式差不多)（当希望将一个对象转换成满足另一个新接口的对象时，可以创建一个Wrapper类，持有原类的一个实例，在Wrapper类的方法中，调用实例的方法就行。）
		SourceServiceAdapter ssObjectAdapter=new SourceServiceObjectAdapterImpl(ss);
		ssObjectAdapter.print();
		ssObjectAdapter.send();
		
		//（扩展）接口适配器创建（当不希望实现一个接口中所有的方法时，可以创建一个抽象类Wrapper，实现所有方法，我们写别的类的时候，继承抽象类即可。）
		SourceServiceAdapter sspAdapter=new SourceServiceInterfacePrintAdapterImpl();
		SourceServiceAdapter sssAdapter=new SourceServiceInterfaceSendAdapterImpl();
		sspAdapter.print();
		sssAdapter.send();
	}
}
