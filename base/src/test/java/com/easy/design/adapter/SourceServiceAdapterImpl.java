package com.easy.design.adapter;
/**
 * 
 * @Title: SourceServiceAdapterImpl.java 
 * @Package com.easy.design.adapter 
 * @Description: 实现适配旧实现
 * @author caiJunJun
 * @date 2017年2月4日
 *
 */
public class SourceServiceAdapterImpl extends SourceServiceImpl implements SourceServiceAdapter {

	@Override
	public void send() {
		System.out.println("ClassAdapters send");
	}

}
