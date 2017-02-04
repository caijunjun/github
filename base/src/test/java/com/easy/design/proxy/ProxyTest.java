package com.easy.design.proxy;

import com.easy.design.SourceService;
/**
 * 
 * @Title: ProxyTest.java 
 * @Package com.easy.design.proxy 
 * @Description: 代理模式
 * @author caiJunJun
 * @date 2017年2月4日
 *
 */
public class ProxyTest {

	public static void main(String[] args) {
		// (代理)其实每个模式名称就表明了该模式的作用，代理模式就是多一个代理类出来，替原对象进行一些操作，比如我们在租房子的时候回去找中介，为什么呢？因为你对该地区房屋的信息掌握的不够全面，希望找一个更熟悉的人去帮你做，此处的代理就是这个意思
		SourceService sourceService = new SourceServiceProxy();
		sourceService.print();
	}
}
