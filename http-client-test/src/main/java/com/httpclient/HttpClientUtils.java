package com.httpclient;

import java.io.IOException;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.URI;
import org.apache.commons.httpclient.URIException;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 
 * @author wangyanhao
 *
 */
public class HttpClientUtils {
	private static final Log log = LogFactory.getLog(HttpClientUtilsTest.class);	
	private HttpClient  httpClient = new HttpClient(); ;
	private PostMethod postMethod =new PostMethod();
	private String uri;
	public String getUri() {
		return uri;
	}


	public void setUri(String uri) {
		this.uri = uri;
	}


	public PostMethod getPostMethod() {
		return postMethod;
	}


	public void setPostMethod(PostMethod postMethod) {
		this.postMethod = postMethod;
	}


	public HttpClient getHttpClient() {
		return httpClient;
	}


	public void setHttpClient(HttpClient httpClient) {
		this.httpClient = httpClient;
	}

	/**
	 * get方式
	 */
	public  String SendDataByGet(){
		return null;
	}
	
	@SuppressWarnings("deprecation")
	public String SendUrlDataByPost(String uri){
		String respone = null;
		try {
			
			URI url = new URI(uri);
			
			this.getPostMethod().setURI(url);
			
			HttpMethod	httpMethod =this.getPostMethod();
			
			httpClient.executeMethod(httpMethod);
			if(httpMethod.getStatusCode()==HttpStatus.SC_OK){
				  respone = httpMethod.getResponseBodyAsString();
				 System.out.println(respone);
			 }else{
				 respone="操作失败！";
			 }
		} catch (URIException e) {
			log.error("URL地址异常！");
		} catch (HttpException e) {
			log.error("HTTP地址异常！");
		} catch (IOException e) {
			log.error("io异常！");
		}
		 
		return respone;
	}
	
	 
	
}
