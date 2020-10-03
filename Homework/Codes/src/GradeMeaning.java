import java.util.Scanner;
public class GradeMeaning {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the marks of yours: ");
      int marks = sc.nextInt();
      char grade;
      if(marks>=90 && marks<=100){
         grade = 'A';
      }else if(marks>=80 && marks<=89){
         grade = 'B';
      }
      else if(marks>=70 && marks<=79){
         grade = 'C';
      }
      else if(marks>=60 && marks<=69){
          grade = 'D';
       }
      else {
         grade = 'F';
      }
      
      switch(grade) {
         case 'A' :
            System.out.println("Excellent");
            break;
         case 'B' :
        	 System.out.println("Good");
             break;
         case 'C' :
            System.out.println("Average");
            break;
         case 'D' :
            System.out.println("Deficient");
            break;
         case 'F' :
            System.out.println("Failed");
            break;
         default :
         System.out.println("Invalid grade");
      }
   }
}