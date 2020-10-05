import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a = 0, b = 1;
        for (int i = 1; i <= num; ++i)
        {
            System.out.print(a + "  ");
            int sum = a + b;
            a = b;
            b = sum;
        }
        sc.close();

    }
}