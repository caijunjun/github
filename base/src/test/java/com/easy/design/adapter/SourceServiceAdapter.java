package com.easy.design.adapter;

/**
 * 
 * @Title: SourceServiceAdapter.java 
 * @Package com.easy.design.adapter 
 * @Description: 类适配器模式（接口适配旧接口）
 * @author caiJunJun
 * @date 2017年2月4日
 *
 */
public interface SourceServiceAdapter extends SourceService {
	public void send();
}
