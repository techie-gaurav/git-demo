import java.util.Scanner;
import static java.lang.Math.sin;
public class SinSeries{ 
	public static void sin_func(float num)  
	{      
	    float accuracy = 0.0001f, denom, sinx, sinval;     
	    num = num * (float)(3.142 / 180.0);  	  
	    float x1 = num;  	     	    
	    sinx = num;          	      	  
	    sinval = (float)sin(num);      
	    int i = 1;  
	    do
	    {  
	        denom = 2 * i * (2 * i + 1);  
	        x1 = -x1 * num * num / denom;  
	        sinx = sinx + x1;  
	        i = i + 1;  
	    } while (accuracy <= sinval - sinx);  
	       System.out.println(sinx);  
	}  
    public static void main(String args[]) 
    { 
    	System.out.println("Enter a number: ");
    	Scanner sc=new Scanner(System.in);
        int num=sc.nextInt(); 
        float num1= (float)num;       
        sin_func(num1); 
        sc.close();
    } 
} 