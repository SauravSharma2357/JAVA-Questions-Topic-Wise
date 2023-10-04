package Patterns;

import java.util.Scanner;

public class Pattern_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int n = kc.nextInt();
		int num=1;
		int space=n-1;
		int row=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			int count=row;
			while(j<=num) {
				System.out.print(count+" ");
				j++;
				if(j<=row) {
					count++;
				}
				else {
					count--;
				}
			}
			System.out.println();
			num+=2;
			space--;
			row++;
		}
	}

}
