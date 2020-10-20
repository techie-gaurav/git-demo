
public class Rec11 {

		public static void main(String[] args) {
	
			int[] arr= {3, 5, 6, 3, 3, 3, 4, 1, 3, 4};
			System.out.println(findIndex(arr, 3, 3));
		
		}
		
		public static int findIndex(int[] arr, int idx, int data) {
			if(idx == arr.length) {
				return -1;
			}
			if(arr[idx] == data) {
				return idx;
			}
			int fi = findIndex(arr, idx+1, data);
			return fi;		
		}	
		
}


