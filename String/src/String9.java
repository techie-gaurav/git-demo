
public class String9 {

	public static void main(String[] args) {
		String str = "abc";
		printAllP("abc","");
//		System.out.println();
//		printAllP2("abc","");

	}
	
	
	public static void printAllP(String ques, String ans) {
		if(ques.equals("")) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0; i<ques.length(); i++) {
			printAllP(ques.substring(0,i)+ques.substring(i+1), ans+ques.charAt(i));
		}
	}
	
	
	
	
	
	public static void printAllP2(String ques, String ans) {
		if(ques.equals("")) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0; i<ques.length(); i++) {
			String newQ=ques.substring(0,i)+ques.substring(i+1);
			String newA=ans+ques.charAt(i);
			printAllP(newQ, newA);
		}
	}
	
}
