package com.atguigu.team.service;
/**
 * 
 * 
 * @Description 表示员工的状态
 * @author kuikui	Email:shakuil@qq.com
 * @version
 * @date 2020年5月25日下午2:55:07
 * 
 * 
 */
//public class Status {
//
//	private final String NAME;
//	private Status(String name) {
//		this.NAME = name;
//	}
//
//	public static final Status FREE = new Status("FREE");
//	public static final Status BUSY = new Status("BUSY");
//	public static final Status VOCATION = new Status("VOCATION");
//
//	public String getNAME() {
//		return NAME;
//	}
//
//	@Override
//		public String toString() {
//			// TODO Auto-generated method stub
//			return NAME;
//		}
//
//}

public enum Status{
	FREE,BUSY,VOCATION;
}