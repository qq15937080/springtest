package com.wyh.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlCallOutAddressByDate {
	
	
	public String getDateByUrl(String str){
	String address=str;//接口地址+传递的参数
	URL url;//定义一个url下面进行实例
	String result = null;//返回的结果值
	InputStreamReader isr;//定义一个isr下面进行输入流
	try {
	url = new URL(address);// 定义一个url类的实例
	isr = new InputStreamReader(url.openStream(),"GB2312");// 输入流
	BufferedReader br = new BufferedReader(isr);//将字符流转换为字符串流
	result = br.readLine();
	} catch (MalformedURLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	return result;
	}
	
	protected URLConnection conn;

	public String getymnr(String myUrl){
	 
	   StringBuffer document = new StringBuffer();
	   try {
	          URL url = new URL(myUrl);    // 根据指定的URL字符串，创建一个URL实例
	          conn = url.openConnection(); // 创建连接，之后就能通过创建的这个连接读取Web页面内容
	          BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	          String line = null;
	          while ((line = reader.readLine()) != null)
	         document.append(line);
	          reader.close();
	          
	      } catch (MalformedURLException e) {
	       
	      } catch (IOException e) {
	        
	      }
	      return document.toString();
	}
	
}
