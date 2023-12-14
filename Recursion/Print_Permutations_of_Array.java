package Recursion;

public class Print_Permutations_of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
		printpermutations(arr,0);
	}
	
	public static void printpermutations(int[] arr, int cid) {
		
		if(cid==arr.length-1) {
//			if(check(arr,0,arr.length-1)) {
//				printArray(arr);
//			}
//			printArray(arr);
			check(arr,0,arr.length-1);
			return;
		}
		for(int i=cid;i<arr.length;i++) {
			swap(arr,i,cid);
			printpermutations(arr,cid+1);
			swap(arr,i,cid);
		}
	}
	
	public static void printArray(int[] a) {
		System.out.println("");
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void check(int[] arr, int si, int ei) {
		int sumSi = arr[si];
		int sumEi = arr[ei];
		while(si<ei) {
			if(sumSi<sumEi) {
				si++;
				sumSi = sumSi+arr[si];
			}
			if(sumSi>sumEi) {
					ei--;
					sumEi = sumEi+arr[ei];
				}
			if(sumSi==sumEi) {
				si++;
				ei--;
//				sumEi = sumEi+arr[ei];
//				sumSi = sumSi+arr[si];
			}
		}
		System.out.println(sumSi+" "+sumEi);
		if(sumSi == sumEi) {
			for(int i=0; i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
		}
		
//		return false;
	}

}
