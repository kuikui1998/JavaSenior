package com.atguigu.team.service;
/**
 * 
 * @Description 自定义异常类
 * @author kuikui	Email:shakuil@qq.com
 * @version
 * @date 2020年5月25日下午6:45:20
 */
public class TeamException extends Exception{

	 static final long serialVersionUID = -338759929948L;
	
	 public TeamException() {
		 super();
	 }
	 
	 public TeamException(String msg) {
		 super(msg);
	 }
	 
}
