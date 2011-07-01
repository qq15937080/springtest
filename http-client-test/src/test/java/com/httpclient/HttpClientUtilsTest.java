package com.httpclient;

import org.junit.Test;

/**
 * 
 * @author wangyanhao
 *
 */
public class HttpClientUtilsTest {
	 @Test
	 public void test(){
		 HttpClientUtils http= new HttpClientUtils();
		 String a=http.SendUrlDataByPost("http://esales1.ofcard.com:8088/mobinfo.do?mobilenum=18610280350");
		 System.out.println(a);
	 }
	
}
