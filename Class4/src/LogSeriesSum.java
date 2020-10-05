import java.util.Scanner;
public class LogSeriesSum { 
	public static float logseriessum(int i, int n, float sum){  
	    if (i > n) {
	        return sum; 
	    }	     
	    else { 
	        if(i % 2 == 0) {  
	            sum -= (float)1 / i; 
	        }	        
	        else {
	            sum += (float)1 / i; 
	        }      
	        return logseriessum(i + 1, n, sum); 
	    } 
	}  
    public static void main(String args[]) 
    { 
    	System.out.println("Enter a number: ");
    	Scanner sc=new Scanner(System.in);
        int num=sc.nextInt(); 
        int i=1;
        float sum=0.0f;
        System.out.printf("Sum is %f", logseriessum(i,num,sum));   
        sc.close();

    } 
} 