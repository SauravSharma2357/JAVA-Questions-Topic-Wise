package Patterns;

import java.util.*;

public class Pattern_Number_Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int num =1;
		int row=1;
		int count=1;
		while(row<=N) {
			int i=1;
			while(i<=num) {
				System.out.print(count+" ");
				count++;
				i++;
			}
			System.out.println();
			row++;
			num++;
		}
	}

}
