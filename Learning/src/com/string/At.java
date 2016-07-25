package com.string;

public class At {

	public static void main(String args[]) {
		At a = new At();
		String func = a.getUniqueChars("23423143232351155");
		System.out.println(func);

	}

	public String getUniqueChars(String str) {
		if(str.length()==0){
			return str;
		}
		return str.charAt(0)+getUniqueChars(str.replaceAll(str.charAt(0)+"", ""));
	}

}
