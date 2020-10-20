
public class Rec9{

	public static void main(String[] args) {
		
		int[] arr= {5,6,1,4,8,17};
		System.out.println(findFirstIdx(arr, 0, 5));
		System.out.println(findLastIdx(arr, 0, 4));
				
	}
	
	public static int findFirstIdx(int[] arr, int vidx, int data) {
		if (vidx == arr.length) {
			return -1;
		}
		if(arr[vidx] == data) {
			return vidx;
		}
		return findFirstIdx(arr, vidx+1, data);
	}
	
	public static int findLastIdx(int[] arr, int vidx, int data) {
		if(vidx == arr.length) {
			return -1;
		}
		int fli = findLastIdx(arr, vidx+1, data);
		if(fli != -1) {
			return fli;
		}
		else {
			if(arr[vidx] == data) {
				return vidx;
			}
			else {
				return -1;
			}
		}
	}
			
}
