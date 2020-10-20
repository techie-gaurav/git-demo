
public class Rec1 {

	public static void main(String[] args) {
		printIncreasing(5);
		System.out.println();
		printDecreasing(5);
	}
	public static void printIncreasing(int num) {
		if(num==0) {
			return;
		}
		printIncreasing(num-1);
		System.out.println(num);
	}
			
	public static void printDecreasing(int num) {
		if(num==0) {
			return;
		}
		System.out.println(num);
		printDecreasing(num-1);
	}
  }
