
public class FirstIndex {

	public static void main(String[] args) {
		int[] arr= {5,4,6,1,4,4,8,17};
		System.out.println(findFirstIdx(arr, 0, 4));
	}
	
	public static int findFirstIdx(int[] arr, int idx, int data) {
		if(idx == arr.length) {
			return -1;
		}
		if(arr[idx] == data) {
			return idx;
		}
		
		return findFirstIdx(arr, idx+1, data);
				
	}

}
