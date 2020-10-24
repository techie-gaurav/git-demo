import java.util.ArrayList;

public class String3 {

	public static void main(String[] args) {
		System.out.print(getKeypad("12"));
		
	
	}
	
	public static ArrayList<String> getKeypad(String str){
	if(str.length()== 0) {
		ArrayList<String> temp = new ArrayList<>();
		temp.add(" ");
		return temp;
	}
	char ch = str.charAt(0);
	String ros = str.substring(1);
	ArrayList<String> rr = getKeypad(ros);
	ArrayList<String> mr = new ArrayList<>();
	String mc = getChoice(ch);
	for(String s: rr) {	
		for (int i = 0; i < mc.length(); ++i) {
           mr.add(mc.charAt(i)+s);
        }

	}
	return mr;
	}
	
	public static String getChoice(char key) {
        if (key == '1') {
            return "abc";
        }
        if (key == '2') {
            return "def";
        }
        if (key == '3') {
            return "ghi";
        }
        if (key == '4') {
            return "jkl";
        }
        if (key == '5') {
            return "mno";
        }
        if (key == '6') {
            return "pqrs";
        }
        if (key == '7') {
            return "tuv";
        }
        if (key == '8') {
            return "wx";
        }
        if (key == '9') {
            return "yz";
        }
        if (key == '0') {
            return ".;";
        }
        return "";
    }
	
}
