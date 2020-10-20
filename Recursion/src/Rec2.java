
public class Rec2 {

	public static void main(String[] args) {
		printDI(6);		
		
	}
		
	public static void printDI(int num) {
		if(num==0) {
			return;
		}
		if(num%2!=0) {
		System.out.println("Hi  "+num);
	    }
		printDI(num-1);
		if(num%2==0) {
			System.out.println("Bye "+num);
		}
			
  }
}