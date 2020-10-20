
public class FindLastIndex {

	public static void main(String[] args) {
		int[] arr= {5,4,6,1,4,4,8,17};
		System.out.println(findLastIdx(arr, 0, 4));
	}
	
	public static int findLastIdx(int[] arr, int idx, int data) {
		if(idx == arr.length) {
			return -1;
		}
		int fli = findLastIdx(arr, idx+1, data);
		if(fli != -1) {
			return fli;
		}
		else {
			if(arr[idx] == data) {
				return idx;
			}
			else {
				return -1;
			}
		}
	}

}
