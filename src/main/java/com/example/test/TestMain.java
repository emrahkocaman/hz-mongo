package com.example.test;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.hazelcast.core.HazelcastInstance;

public class TestMain {
	
	static ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
	
	public static void main(String[] args) {
		HazelcastInstance hi = (HazelcastInstance) context.getBean("instance");
		Map test = hi.getMap("map");
		test.put("test", "value");
		System.out.println();
	}
	
}
