import java.util.Scanner;

public class LargeSmall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int count=0, max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
		while(count<n)
		{
			int num = sc.nextInt();
			if(num>max) {
				max=num;
			}
			else if(num<min) {
				min=num;
			}
			count++;
		}
		System.out.println("max: "+max);
		System.out.println("max: "+min);
		sc.close();
	}
}
