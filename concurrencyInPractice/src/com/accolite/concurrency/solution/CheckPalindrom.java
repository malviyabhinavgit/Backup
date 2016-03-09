package com.accolite.concurrency.solution;

import java.util.Scanner;
import java.util.Stack;

public class CheckPalindrom {
	
	public static boolean isPalindrome(String s){
		int len = s.length();
		Stack <Character> stack = new Stack <Character>();
		for(int i = 1; i<len; i++){
			char currentChar = s.charAt(i);
			if(!stack.isEmpty()){
				char currentTop = stack.firstElement();
				if(currentTop==currentChar){
					return true;
				}
				if(stack.size()>1){
					stack.pop();
					char secondTop = stack.firstElement();
					if(secondTop==currentChar){
						return true;
					}else{
						stack.push(currentTop);
					}
				}
			}
			stack.push(currentChar);
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = in.nextLine();
		if(isPalindrome(input)){
			System.out.println("it contains");
		}else{
			System.out.println("it doesnt contain");
		}
	}

}
