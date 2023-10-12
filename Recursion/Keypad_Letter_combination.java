package Recursion;

import java.util.*;

public class Keypad_Letter_combination {
	
	static String [] Map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "23";
		ArrayList<String> ll = new ArrayList<String>();
		Print(s,"",ll);
	}
	public static void Print(String s, String ans, ArrayList<String> ll) {
		if(s.length()==0) {
			ll.add(ans);
			return;
		}
		char ch = s.charAt(0);
		String press = Map[ch-'0'];
		for(int i=0;i<press.length();i++) {
			Print(s.substring(1),ans+press.charAt(i),ll);
		}
		
	}
	

}
