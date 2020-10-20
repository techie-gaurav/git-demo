
public class Rec6 {

	public static void main(String[] args) {
		
		int[] arr= {5,6,1,4,8};
		printArrayStupid(arr);
		System.out.println();
		printArraySmart(arr,0);
		System.out.println();
		printArraySmart2(arr,0);
	
	}
	
	public static void printArrayStupid(int[] arr) {
		if(arr.length == 0) {
			return;
		}
		int[] temp = new int[arr.length-1];
		for(int i=0; i<arr.length-1; i++) {
			temp[i] = arr[i+1];
		}
		System.out.println(arr[0]);
		printArrayStupid(temp);		
	}
	
	public static void printArraySmart(int[] arr, int vidx) {
		if(vidx == arr.length) {
			return;
		}
		System.out.println(arr[vidx]);
		printArraySmart(arr,vidx+1);
	}
	
	public static void printArraySmart2(int[] arr, int vidx) {
		if(vidx == arr.length) {
			return;
		}
		printArraySmart2(arr,vidx+1);
		System.out.println(arr[vidx]);
		
	}			
}
