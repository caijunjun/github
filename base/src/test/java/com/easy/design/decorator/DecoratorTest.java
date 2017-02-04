package com.easy.design.decorator;

import com.easy.design.SourceService;
import com.easy.design.SourceServiceImpl;

/**
 * 
 * @Title: DecoratorTest.java 
 * @Package com.easy.design.decorator 
 * @Description: 装饰模式（跟适配器模式中的 对象适配差不多）
 * @author caiJunJun
 * @date 2017年2月4日
 *
 */
public class DecoratorTest {
	public static void main(String[] args) {
		SourceService sourceService=new SourceServiceImpl();
		//（增强）顾名思义，装饰模式就是给一个对象增加一些新的功能，而且是动态的，要求装饰对象和被装饰对象实现同一个接口，装饰对象持有被装饰对象的实例
		SourceServiceDecorator ssDecorator=	new SourceServiceDecorator(sourceService);
		ssDecorator.printPower();
	}

}
