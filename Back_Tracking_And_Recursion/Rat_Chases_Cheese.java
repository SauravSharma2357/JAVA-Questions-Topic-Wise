package Back_Tracking_And_Recursion;

import java.util.Scanner;

public class Rat_Chases_Cheese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int n = kc.nextInt();
		int m = kc.nextInt();
		char [] [] arr = new char[n][m];
		for(int i=0;i<arr.length;i++) {
			String s = kc.next();
			for(int j=0;j<s.length();j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		int[][] ans = new int [n][m];
		Rat(arr,0,0, ans);
		if(val==false) {
			System.out.println("No Path Found");
		}
	}
	static boolean val = false;
	public static void Rat(char[][] arr, int i,int j, int[][] ans) {
		if(i==arr.length-1 && j==arr[0].length-1 && arr[i][j]!='X') {
			ans[i][j]=1;
			Display(ans);
			val=true;
			return;
		}
		
		if(i<0 || i>=arr.length || j<0 || j>=arr[0].length || arr[i][j]=='X') {
			return;
		}
		arr[i][j]='X';
		ans[i][j]=1;
		int[] r = {-1,1,0,0};
		int[] c = {0,0,-1,1};
		for(int k=0;k<c.length;k++) {
			Rat(arr,i+r[k],j+c[k],ans);
		}
//		Rat(arr,i-1,j,ans);
//		Rat(arr,i+1,j,ans);
//		Rat(arr,i,j-1,ans);
//		Rat(arr,i,j+1,ans);
		arr[i][j]='O';
		ans[i][j]=0;
	}
	public static void Display(int[][] ans) {
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans[0].length;j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}

}
