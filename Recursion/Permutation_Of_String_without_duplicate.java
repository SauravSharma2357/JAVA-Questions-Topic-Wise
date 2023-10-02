package Recursion;

import java.util.*;

public class Permutation_Of_String_without_duplicate {

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
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			Boolean val = true;
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(j)==ch) {
					val=false;
					break;
				}
			}
			if(val==true) {
				String s1 = str.substring(0,i);
				String s2 = str.substring(i+1);
				Permutation(s1+s2,ans+ch);
			}
		}
	}

}
