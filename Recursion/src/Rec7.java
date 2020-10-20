
public class Rec7 {

	public static void main(String[] args) {
		
		int[] arr= {5,6,1,4,8,17};
				
		System.out.println(max(arr,0));
	}
	
	public static int max(int[] arr, int vidx) {
		if(vidx == arr.length-1) {
			return arr[vidx]; 
		}
		int maxofRest = max(arr, vidx+1);
		if(maxofRest>arr[vidx]) {
			return maxofRest;
		}
		else {
			return arr[vidx];
		}
	}
		
}
