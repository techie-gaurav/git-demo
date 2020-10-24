import java.util.ArrayList;

public class String7 {

	public static void main(String[] args) {
//		ArrayList<String> res = new ArrayList<>();
//		res = getPathForTwo(1,1,3);	
//		for(int i=0; i<res.size(); i++) {
//			System.out.println(res.get(i));
		
		//int n=3, m=4;
		System.out.println(getAllPathWD(1,1,3,3));
		}

	
	public static ArrayList<String> getAllPathWD(int startRow, int startCol, int endRow, int endCol){
		if(startRow == endRow && startCol == endCol) {
			ArrayList<String> temp = new ArrayList<>();
			temp.add("");
			return temp;
		}
		else if(startRow>endRow || startCol>endCol) {
			ArrayList<String> temp = new ArrayList<>();
			return temp;
		}
				
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> rr = getAllPathWD(startRow, startCol+1, endRow, endCol);
			for(String s1: rr) {	
				list.add("H"+s1);
			}
			rr = getAllPathWD(startRow+1, startCol, endRow, endCol);
			for(String s1: rr) {	
				list.add("V"+s1);
			}
			rr = getAllPathWD(startRow+1, startCol+1, endRow, endCol);
			for(String s1: rr) {	
				list.add("D"+s1);
			}
		return list;		
	}
	
}
