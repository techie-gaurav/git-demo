
public class Rec4 {

	public static void main(String[] args) {
		System.out.println(power(2,5));
		System.out.println(powerBtr(2,5));

		
	}
	
	public static int power(int num, int pow) {
		if(pow == 0) {
			return 1;
		}	
        return num*power(num,pow-1);
	}
	
	public static int powerBtr(int num, int pow) {
		if(pow == 0) {
			return 1;
		}
		if(pow == 1) {
			return num;
		}
		int powby2 = powerBtr(num, pow/2);
		if(pow%2 == 0) {
			return powby2*powby2;
		}
		else {
			return powby2*powby2*num;
		}
	}
			
 }
