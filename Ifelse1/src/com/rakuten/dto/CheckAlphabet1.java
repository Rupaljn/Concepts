package com.rakuten.dto;

public class CheckAlphabet1 {
public static void main(String[] args) {
	char c = '*';
	if(Character.isAlphabetic(c)){
		System.out.println(c + " is alphabet");
	}
	else{
		System.out.println(c + " is not alphabet");
	}
}
}
