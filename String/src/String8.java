
public class String8 {

	public static void main(String[] args) {
		String s = "abc";
		findAllSS(s,"");
	}
	public static void findAllSS(String ques, String ans) {
		if(ques.equals("")) {
		System.out.println(ans);
		
		return;
		}
		//with me
		findAllSS(ques.substring(1), ans+ques.charAt(0));
		
		//without me
		findAllSS(ques.substring(1), ans);

		return;
	}
}
