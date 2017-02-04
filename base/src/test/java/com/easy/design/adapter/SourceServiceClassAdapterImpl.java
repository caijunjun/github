package com.easy.design.adapter;

import com.easy.design.SourceServiceImpl;

/**
 * 
 * @Title: SourceServiceClassAdapterImpl.java 
 * @Package com.easy.design.adapter 
 * @Description: 类适配器模式（实现适配旧实现）
 * @author caiJunJun
 * @date 2017年2月4日
 *
 */
public class SourceServiceClassAdapterImpl extends SourceServiceImpl implements SourceServiceAdapter {

	@Override
	public void send() {
		System.out.println("SourceServiceClassAdapterImpl send");
	}

}
