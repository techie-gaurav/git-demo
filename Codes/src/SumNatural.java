import java.util.Scanner; 
class SumNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int i=0 ,sum=0;
        while(i<=num)
        {
        	sum = sum + i;
        	i++;
        }  
        System.out.println("Sum of first "+num+" natural nos = "+sum);
    }
}