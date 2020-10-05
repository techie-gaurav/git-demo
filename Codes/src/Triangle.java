import java.util.Scanner;
public class Triangle{
public static void main(String[] args) {
        int ang1, ang2, ang3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for the angles: ");
        ang1 = sc.nextInt();
        ang2 = sc.nextInt();
        ang3 = sc.nextInt();
        if((ang1!=0) && (ang2!=0) && (ang3!=0)){
        	if((ang1+ang2+ang3)==180) {
        	System.out.println("Triangle is valid");
        	}
        	else {
            	System.out.println("Triangle is not valid");
        	}
        }
        else{
        System.out.println("Triangle is not valid");
        }
}
}