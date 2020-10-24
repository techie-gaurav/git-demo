import java.util.ArrayList;

public class String4 {

	public static void main(String[] args) {
	System.out.println(getBoard(1,10));	

	}
	public static ArrayList<String> getBoard(int start, int end){
		if(start==end) {
			ArrayList<String> temp = new ArrayList<>();
			temp.add(Integer.toString(end));
			return temp;
		}
		if(start>end) {
			ArrayList<String> temp2 = new ArrayList<>();
			return temp2;
		}
				
		ArrayList<String> list = new ArrayList<>();
		for(int i=1; i<=6; i++) {
		ArrayList<String> rr = getBoard(start+i,end);
			for(String s1: rr) {
				list.add(Integer.toString(start)+"-"+s1);
			}
		}
		return list;		
	}
	
}
