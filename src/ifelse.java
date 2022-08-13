import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        System.out.println("enter your age");
        int age;
        Scanner sc= new Scanner(System.in);
        age=sc.nextInt();
        switch(age){
            case 18:
                System.out.println("you are an adult");
               break;
            case 30:
                System.out.println("you are in your middle age");
                break;
            case 50:
                System.out.println("you are getting old");
                break;
            default:
                System.out.println("sorry error: please choose your age between the given numbers-18,30,50");








         /*   if (age>18){
                System.out.println("you are an adult");
            } else if(age<=30){
                System.out.println("you are in your middle age");
            }else if(age>=50){
                System.out.println("you are getting old");
            } else if(age <18){
                System.out.println("you are gobar");*/
        }
        System.out.println("thank you for your coordination");

    }
}
