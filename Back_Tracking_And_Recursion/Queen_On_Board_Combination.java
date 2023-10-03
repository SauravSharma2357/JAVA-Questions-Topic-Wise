package Back_Tracking_And_Recursion;

import java.util.Scanner;

public class Queen_On_Board_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int Board = kc.nextInt();
		int Queens = kc.nextInt();
		boolean[] bool = new boolean[Board];
		QOB(bool,Queens,0,"",0);
	}
	public static void QOB(boolean[] bool,int tq, int qpsf, String ans, int idx) {
		if(qpsf==tq) {
			System.out.println(ans);
			return;
		}
		for(int i=idx;i<bool.length;i++){
			if(bool[i]==false) {
				bool[i]=true;
				QOB(bool,tq,qpsf+1,ans+"b"+i+"q"+qpsf,i+1);
				bool[i]=false;
			}
		}
	}

}
