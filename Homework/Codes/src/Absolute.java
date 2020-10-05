import java.util.Scanner;

class Absolute{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int num;
System.out.println("Enter value for a number:");
num=sc.nextInt();
num=Math.abs(num);
System.out.println("Absolute value:"+num);
}
}