package com.easy.design.adapter;

public class SourceServiceAdapterImpl extends SourceServiceImpl implements SourceServiceAdapter {

	@Override
	public void send() {
		System.out.println("ClassAdapters send");
	}

}
