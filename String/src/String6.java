import java.util.ArrayList;

public class String6 {

	public static void main(String[] args) {
		ArrayList<String> res = new ArrayList<>();
		res = getPathForTwo(1,1,3);	
		for(int i=0; i<res.size(); i++) {
			System.out.println(res.get(i));
		}

	}
	public static ArrayList<String> getPathForTwo(int startRow, int startCol, int n){
		if(startRow == n && startCol == n) {
			ArrayList<String> temp = new ArrayList<>();
			temp.add("");
			return temp;
		}
		if(startRow>n || startCol>n) {
			ArrayList<String> temp = new ArrayList<>();
			return temp;
		}
				
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> rr = getPathForTwo(startRow+1, startCol, n);
			for(String s1: rr) {	
				list.add("V"+s1);
			}
			rr = getPathForTwo(startRow, startCol+1, n);
			for(String s1: rr) {	
				list.add("H"+s1);
			}		
		return list;		
	}
	
}
