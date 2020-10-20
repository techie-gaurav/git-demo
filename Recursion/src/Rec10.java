
public class Rec10 {

	public static void main(String[] args) {
		
		int[] arr= {2,2,1,4,5,2,5,8};
		int[] temp = allIndices(arr,0,5,0);
		for(int i:temp)
			System.out.println(i);
				
	}
	
	public static int[] allIndices(int[] arr, int vidx, int data, int fsf) {
		if(vidx == arr.length) {
			int[] temp = new int[fsf];
			//return temp;
		}
       ////   pre-area
		if(arr[vidx] == data) {
			fsf++;
		}
		int[] rr = allIndices(arr, vidx+1, data, fsf);
	   ////   post-area
		if(arr[vidx] == data) {
			rr[fsf-1] = vidx;
		}
		return rr;
	}	
	
}
