
public class Rec15 {

		public static void main(String[] args) {
	
			int[] arr= {3, 5, 6, 3, 3, 3, 4, 1, 3, 4};
			System.out.println(findMin(arr, 0));
		
		}
		
		public static int findMin(int[] arr, int idx) {
			if (idx == arr.length-1) {
				return arr[idx];
			}
			int fmin = findMin(arr, idx+1);
			if(fmin < arr[idx]) {
				return fmin;
			}
			else {
				return arr[idx];
			}
		}
		
}


