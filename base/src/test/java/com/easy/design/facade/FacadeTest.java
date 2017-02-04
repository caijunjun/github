package com.easy.design.facade;

/**
 * 
 * @Title: FacadeTest.java 
 * @Package com.easy.design.facade 
 * @Description: 外观模式（模拟电脑启动过程）
 * @author caiJunJun
 * @date 2017年2月4日
 *
 */
public class FacadeTest {
	public static void main(String[] args) {
		Computer computer = new Computer();  
        computer.startup();  
        computer.shutdown();  
	}
}
