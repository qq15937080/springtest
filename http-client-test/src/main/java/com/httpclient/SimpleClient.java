package com.httpclient;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.PostMethod;
import org.junit.Test;
 


 
 

public class SimpleClient {
	
	 private static HttpMethod getPostMethod(){
	        PostMethod post = new PostMethod("http://esales1.ofcard.com:8088/mobinfo.do?mobilenum=18610280350");
	         
	        return post;
	    }
	 @Test
	public void testHttpMethod() throws HttpException, IOException{
		 HttpMethod httpMethod =SimpleClient.getPostMethod();
		 HttpClient  client =  new HttpClient();
		 client.executeMethod(httpMethod);
		 if(httpMethod.getStatusCode()==HttpStatus.SC_OK){
			 String respone = httpMethod.getResponseBodyAsString();
			 System.out.println(respone);
		 }
		 httpMethod.releaseConnection();
	}
}