package Patterns;

import java.util.*;

public class R4_Pattern {
	public static void main(String[] args) {
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int row=1;
		int stars =1;
		while(row<=N) {
			int i=1;
			while(i<=stars) {
				System.out.print("*");
				i++;
			}
			System.out.println();
			stars++;
			row++;
		}
	}
	
}
