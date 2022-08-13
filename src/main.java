import java.util.Scanner;
 public class main{
     public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         System.out.println("enter your first subject marks");
         int one = sc.nextInt();
         System.out.println("enter your second subject marks");

         int two= sc.nextInt();
         System.out.println("enter your thid subject marks");
         int three= sc.nextInt();
         System.out.println("enter your fourth subject marks");
         int four= sc.nextInt();
         System.out.println("enter your fifth subject marks");
         int five= sc.nextInt();
         int total = one+two+three+four+five;
         int perc= total* 100/500;
         System.out.println("your grand toatal is :" + total);
         System.out.println(perc);
         System.out.println("your percentage is :" + perc);
     }
 }

