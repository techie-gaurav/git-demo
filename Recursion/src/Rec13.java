
public class Rec13 {

		public static void main(String[] args) {
	
			int[] arr= {3, 5, 6, 3, 3, 3, 4, 1, 3, 4};
			System.out.println(findLastOccur(arr, 0, 3));
		
		}
		
		public static int findLastOccur(int[] arr, int vidx, int data) {
			if (vidx == arr.length) {
				return -1;
			}
			int fl = findLastOccur(arr, vidx+1, data);
			if(fl != -1) {
				return fl;
			}
			else {
				if(arr[vidx] == data) {
					return vidx;
				}
				return -1;
			}
		}
		
}


