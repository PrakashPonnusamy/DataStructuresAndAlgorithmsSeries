package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class FirstRecurringCharacter {
//Daily Coding Problem, Easy, Asked by google
	public static void findCharacter(String str) {
		char[] ch = str.toCharArray();
		//Character ch1 = null;
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		for(int i=0;i<ch.length;i++) {
			if(!charCount.containsKey(ch[i])) {
				charCount.put(ch[i], 1);
			} else {
				charCount.put(ch[i], charCount.get(ch[i])+1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			System.out.println(entry.getKey()+ " "+entry.getValue());
		}
		
		//return null;
	}
	

	public static void main(String[] args) {
		String str = "acbbac";
		findCharacter(str);
		//Character result = findCharacter(str);
		//System.out.println(result);
	}
}
