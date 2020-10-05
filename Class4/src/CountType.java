import java.util.Scanner;
class CountType { 
    public static void main(String args[]){ 	
    	System.out.println("Enter the value of input numbers: ");
    	Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        int countpos=0, countneg=0, countzero=0;
        
        while(count!=0) { 
        	int num=sc.nextInt();
            if (num>0) {
                countpos++;
            }
            else if(num<0) {
            	countneg++;
            }
            else {
            	countzero++;
            }
            count--;       
        }   
        System.out.println("Count for positive numbers: " +countpos); 
        System.out.println("Count for negative numbers: " +countneg); 
        System.out.println("Count for zero numbers: " +countzero); 
        sc.close();
    } 
} 