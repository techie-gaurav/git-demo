
public class Rec16 {

	public static void main(String[] args) {
		
		int[] arr= {3, 5, 6, 3, 3, 3, 4, 1, 3, 6, 4};
		printArray(arr,0);	
	}
	public static void printArray(int[] arr, int idx) {
		if(idx == arr.length) {
			return;
		}
		System.out.print(arr[idx]+" ");
		printArray(arr, idx+1);
	}

}
