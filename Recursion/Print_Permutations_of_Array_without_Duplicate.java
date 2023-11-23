package Recursion;

public class Print_Permutations_of_Array_without_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,3};
		printpermutations(arr,0);
	}
	
	public static void printpermutations(int[] arr, int cid) {
		
		if(cid==arr.length-1) {
			printArray(arr);
			return;
		}
			for(int i=cid;i<arr.length;i++) {
				swap(arr,i,cid);
				printpermutations(arr,checkDuplicate(arr,cid));
				swap(arr,i,cid);
			}
	}
	
	public static int checkDuplicate(int[] arr, int cid) {
			for(int j=cid+1;j<arr.length-1;j++) {
				if(cid==arr[j]) {
					cid++;
					break;
				}
			}
			return cid;
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

}
