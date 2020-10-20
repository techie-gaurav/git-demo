
public class Rec3 {

	public static void main(String[] args) {
		System.out.println(fact(6));
		
	}
	
	public static int fact(int num) {
		if(num==0 || num==1) {
			return 1;
		}
		num=fact(num-1)*num;
		return num;
	}	
				
 }
