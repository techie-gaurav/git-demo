import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
    	Scanner sc=new Scanner(System.in);
    	int num=sc.nextInt();
        boolean isPrime = true;
        int count=2;
        while(count<=num) {
        	if(num % count/2 == 0) {
        		System.out.println("Not a prime");
        		isPrime=false;
        		count++;
        		break;   		
        	}
        }
        if(isPrime == true) {
    		System.out.println("prime number");
        }
	}

}
