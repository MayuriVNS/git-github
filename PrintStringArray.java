package com.java.programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintStringArray {
	
	public static void main(String[] args) {
	
	Map<String,Integer> m = new LinkedHashMap<String, Integer>();
	String s = "We few we happy few we band of brothers";
	String[] sp = s.split("");
	
	for(String lit : sp) {
		if(m.containsKey(lit)) {
			Integer value = m.get(lit);
			m.put(lit, value+1);
		}
		else {
			m.put(lit, 1);
		}
		
		System.out.println(lit);
	}

	

}
}