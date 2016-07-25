package com.string;

public class At {

	public static void main(String args[]) {
		At aa = new At();
		String func = aa.getUniqueChars("2342314323235155");
		System.out.println(func);

	}

	public String getUniqueChars(String str) {
		if(str.length()==0){
			return str;
		}
		return str.charAt(0)+getUniqueChars(str.replaceAll(str.charAt(0)+"", ""));
	}

}
