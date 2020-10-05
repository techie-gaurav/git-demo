import java.util.Scanner;
public class Pattern{   
	public static void main(String args[])   {   
		System.out.println("Enter a nmuber: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();  
		
		for(int i=1; i<=num; i++)   
		{   
			for(int j=num; j>=1; j--)   
			{   
				System.out.print("*");   
			}   
			System.out.println(); 
			
		}  
		System.out.println(); 

		for(int i=1; i<=num; i++)   
		{   
			for(int j=1; j<=i; j++)   
			{   
				System.out.print("*");   
			}   
			System.out.println(); 
			
		}  
		System.out.println(); 
		
		for(int i=1; i<=num; i++)   
		{   
			for(int j=2*num-i; j>=i; j--)   
			{   
				System.out.print(" ");   
			}  
			for(int k=1; k<=i; k++)  
			{   
				System.out.print("*");   
			}  
			System.out.println(); 
			
		}  
		System.out.println(); 
		
		for(int i=1; i<=2*num-1; i=i+2)   
		{   
			for(int j=2*num-1; j>i; j=j-2)   
			{   
				System.out.print("  ");   
			}  
			for(int k=1; k<=2*i-1; k=k+2)   
			{   
				System.out.print("*");   
			}  
			System.out.println(); 
			
		}  
		System.out.println(); 
		
		int temp=0;
		for(int i=1; i<=2*num-1; i=i+2)   
		{   temp++;
			for(int j=2*num-1; j>i; j=j-2)   
			{   
				System.out.print("  ");   
			}  
			for(int k=1; k<=2*i-1; k=k+2)   
			{   
				System.out.print(temp);				
			}  
			System.out.println(); 
			
		} 
		System.out.println(); 
		
		int a=num;
		for (int i=1; i<=num; i++)
		{
			for (int j=a; j>1; j--)
			{
				System.out.print("  ");
			}
			for (int k=i; k!=0; k--)
			{
				System.out.print(k);
 
			}
			a--; 
			for (int l=2; l<=i; l++)
			{
				System.out.print(l); 
			}
			System.out.println();
		}
			
		sc.close();
	}   
} 