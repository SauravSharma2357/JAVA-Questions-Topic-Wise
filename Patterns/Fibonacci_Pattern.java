package Patterns;

import java.util.*;

public class Fibonacci_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int n1=0;
		int n2=1;
		int row=1;
		while(row<=N) {
			int i=1;
			while(i<=row) {
				int n3 = n1 +n2;
				System.out.print(n1+" ");
				i++;
				n1=n2;
				n2=n3;
			}
			System.out.println();
			row++;
		}
	}

}
