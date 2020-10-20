
public class Rec8{

	public static void main(String[] args) {
		
		int[] arr= {5,6,1,4,8};
		System.out.println(find(arr, 0, 4));
		System.out.println(find2(arr, 0, 5));

		
	}
	
	public static boolean find(int arr[], int vidx, int data) {
		if(vidx == arr.length) {
			return false;
		}	
		boolean rr = find(arr, vidx+1, data);
		if (rr == true) {
			return true;
		} 
		else {			
			if(arr[vidx] == data) {
				return true;
			}
			return false;
		}
	}
	
	public static boolean find2(int[] arr, int vidx, int data) {
		if(vidx == arr.length) {
			return false;
		}
		if(arr[vidx] == data) {
			return true;
		}
		boolean rr = find2(arr, vidx+1, data);
		return rr;		
	}	
	
}
