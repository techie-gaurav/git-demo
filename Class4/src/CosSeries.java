import java.util.Scanner;
import static java.lang.Math.cos;
public class CosSeries{ 
	static void cos_func(float num) { 
	    float accuracy = (float) 0.0001, x1, denom, cosx, cosval; 	    
	    num = num * (float) (3.142 / 180.0); 
	    x1 = 1; 	    
	    cosx = x1; 	   
	    cosval = (float) cos(num); 
	    int i = 1; 
	    do { 
	        denom = 2 * i * (2 * i - 1); 
	        x1 = -x1 * num * num / denom; 
	        cosx = cosx + x1; 
	        i = i + 1; 	          
	    } 
	    while (accuracy <= cosval - cosx); 
	    System.out.println(cosx); 
	      
	} 
    public static void main(String args[]) 
    { 
    	System.out.println("Enter a number: ");
    	Scanner sc=new Scanner(System.in);
        int num=sc.nextInt(); 
        float num1= (float)num;       
        cos_func(num1); 
        sc.close();
    } 
} 