package Patterns;

import java.util.*;

public class Pattern_with_Zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int row=1;
		while(row<=N) {
			int i=1;
			while(i<=row) {
				if(i==1 || i==row) {
				System.out.print(row+" ");
				}
				else {
					System.out.print("0 ");
				}
				i++;
			}
			System.out.println();
			row++;
			
		}
	}

}
