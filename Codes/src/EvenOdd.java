import java.util.Scanner;
class EvenOdd { 
    public static void main(String args[]){ 	
    	System.out.println("Enter the numbers of even and odd values: ");
    	Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        int sumodd=0,sumeven=0;
        
        while(count!=0) { 
        	int num=sc.nextInt();
            if (num % 2 == 0) {
                sumeven += num;
            }
            else {
                sumodd += num;
            }
            count--;       
        }   
        System.out.println("Even numbers sum: " +sumeven); 
        System.out.println("Odd numbers sum: " +sumodd); 
    } 
} 