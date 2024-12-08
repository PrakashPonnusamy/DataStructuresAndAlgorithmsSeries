package com.arrays;

public class FirstRecurringCharacterCorrectApproach {
	
	public static Character findCharacter(String str) {
		char[] ch = str.toCharArray();
		boolean[] seen = new boolean[122]; //256 ASCII characters
		char charSeen = 0;
		for(int i=0;i<ch.length;i++) {
			charSeen = ch[i];
			
			if(seen[charSeen] == true) {
				return charSeen;
			}
			
			seen[charSeen] = true;
		}
		
		return null;
	}

	public static void main(String[] args) {
		String str = "abbccbbacc";
		System.out.println(findCharacter(str));
	}
}
