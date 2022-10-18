package com.rakuten.dto;

public class CheckAlphabet2 {
public static void main(String[] args) {
	char a = 'A';
	if((a>='a' && a<='z')||(a>='A' && a<='Z')){
		System.out.println(a + " is alphabet");
	}
	else{
		System.out.println(a + " is not alphabet");
	}
}
}
