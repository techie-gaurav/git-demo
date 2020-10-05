import java.util.Scanner;
public class SeriesSum { 
	public static double seriessum(int n) 
    { 
      double i, sum = 0.0; 
      for (i = 1; i <= n; i++) 
          sum = sum + 1/i; 
      return sum; 
    }   
    public static void main(String args[]) 
    { 
    	System.out.println("Enter a number: ");
    	Scanner sc=new Scanner(System.in);
        int num=sc.nextInt(); 
        System.out.printf("Sum is %f", seriessum(num)); 
        sc.close();

    } 
} 