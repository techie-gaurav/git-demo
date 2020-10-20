
public class Rec12 {

		public static void main(String[] args) {
	
			int[] arr= {3, 5, 6, 3, 3, 3, 4, 1, 3, 4};
			System.out.println(findFirstOccur(arr, 0, 3));
		
		}
		
		public static int findFirstOccur(int[] arr, int vidx, int data) {
			if (vidx == arr.length) {
				return -1;
			}
			if(arr[vidx] == data) {
				return vidx;
			}
			return findFirstOccur(arr, vidx+1, data);
		}
		
}


