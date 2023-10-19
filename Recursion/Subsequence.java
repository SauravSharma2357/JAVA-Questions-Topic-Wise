package Recursion;

import java.util.Scanner;

public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		String str = kc.next();
		SubSeq(str,"");
	}
	public static void SubSeq(String str, String ans) {
		if(str.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		char ch = str.charAt(0);
		SubSeq(str.substring(1),ans);
		SubSeq(str.substring(1),ans+ch);
	}

}
