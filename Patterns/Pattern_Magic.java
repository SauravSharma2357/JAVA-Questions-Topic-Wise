package Patterns;

import java.util.*;

public class Pattern_Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int n = (2*N)-1;
		int row=1;
		int stars=N;
		int space=-1;
		while(row<=n) {
			int i=1;
			while(i<=stars) {
				System.out.print("* ");
				i++;
			}
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			int k=1;
			if(row==1 || row==n) {
				k=2;
			}
			while(k<=stars) {
				System.out.print("* ");
				k++;
			}
			System.out.println();
			if(row<N) {
				stars--;
				space+=2;
			}
			else {
				stars++;
				space-=2;
			}
			row++;
		}
	}

}
