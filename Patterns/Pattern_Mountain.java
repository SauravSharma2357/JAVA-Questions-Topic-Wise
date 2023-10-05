package Patterns;

import java.util.*;

public class Pattern_Mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int num=1;
		int space=(2*N)-3;
		int row=1;
		while(row<=N) {
			int i=1;
			while(i<=row) {
				System.out.print(i+" ");
				i++;
				num++;
			}
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			int k=1;
			num=row;
			if(row==N) {
				k=2;
				num=row-1;
			}
			while(k<=row) {
				System.out.print(num+" ");
				k++;
				num--;
			}
			System.out.println();
			row++;
			num=row;
			space-=2;
		}
	}

}
