package Patterns;

import java.util.*;

public class Pascal_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int num=1;
		int row=0;
		while(row<N) {
			int i=0;
			int val=1;
			while(i<num) {
				System.out.print(val+" ");
				val = (((row-i)*val)/(i+1));
				i++;
			}
			System.out.println();
			row++;
			num++;
		}
	}

}
