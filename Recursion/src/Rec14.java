
public class Rec14 {

		public static void main(String[] args) {
	
			int[] arr= {3, 5, 6, 3, 3, 3, 4, 1, 3, 4};
			System.out.println(findMax(arr, 0));
		
		}
		
		public static int findMax(int[] arr, int idx) {
			if (idx == arr.length-1) {
				return arr[idx];
			}
			int fmax = findMax(arr, idx+1);
			if(fmax > arr[idx]) {
				return fmax;
			}
			else {
				return arr[idx];
			}
		}
		
}


