package Recursion;

import java.util.Scanner;

public class Permutation_of_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		String str = kc.next();
		Permutation(str,"");
	}
	public static void Permutation(String str, String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		for (int i=0;i<str.length();i++) {
			String s1 = str.substring(0,i);
			String s2 = str.substring(i+1);
			char ch = str.charAt(i);
			Permutation(s1+s2,ans+ch);
		}
	}

}
