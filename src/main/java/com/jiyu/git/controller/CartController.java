package com.jiyu.git.controller;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CartController {
	
	public static void main(String[] args) {
		Map<String, String> map = new ConcurrentHashMap<String, String>(10);
		System.out.println("hello");
		String name = "lousanniu";
		int age = 22;
		int age2 = 12;
		double random = Math.random();
		System.out.println("hello "+name);
	}
}
