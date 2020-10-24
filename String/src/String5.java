import java.util.ArrayList;

public class String5 {

	public static void main(String[] args) {
		System.out.println(get2DBoard(1,1,3,4));	

	}
	public static ArrayList<String> get2DBoard(int x_start, int y_start,  int x_end, int y_end){
		if(x_start==x_end || y_start==y_end) {
			ArrayList<String> temp1 = new ArrayList<>();
			temp1.add(Integer.toString(x_end));
			temp1.add(Integer.toString(y_end));

			return temp1;
		}
		if(x_start>x_end || y_start>y_end) {
			ArrayList<String> temp2 = new ArrayList<>();
			return temp2;
		}
				
		ArrayList<String> list = new ArrayList<>();
		for(int i=1; i<=x_start; i++) {
			for(int j=1; j<=y_start; j++) {

		ArrayList<String> rr = get2DBoard(x_start+i, y_start+j, x_end, y_end);
			for(String s1: rr) {
				list.add(Integer.toString(x_start)+"-"+s1);
				for(String s2: rr) {
					list.add(Integer.toString(y_start)+"-"+s2);
				}
			}
		  }
		}		
		return list;		
	}
	
}
