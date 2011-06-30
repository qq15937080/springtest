package com.wyh.web;

import org.junit.Test;

public class TestUrlActions {
	@Test
	public void testUrl(){
		String url = "http://119.161.147.111:8066/agent/topupByInterface.action?P0_biztype=topup";
		UrlCallOutAddressByDate by = new UrlCallOutAddressByDate();
		System.out.println(by.getymnr(url));
	}
}
