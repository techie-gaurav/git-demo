import java.util.Scanner;
public class SumChoice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        char choice;
        do
        {
            System.out.print("Enter a 1st number: ");
            num1 = sc.nextInt();        
            System.out.print("Enter a 2nd number: ");
            num2 = sc.nextInt();          
            int sum = num1 + num2;
            System.out.println("Sum of numbers: " + sum);     
            System.out.print("Do you want to continue y/n? ");
            choice = sc.next().charAt(0);
            System.out.println();   
        }while(choice=='y' || choice == 'Y');
    }  
}