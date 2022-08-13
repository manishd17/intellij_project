import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class voe {
    public static void main(String[] args) {
        int ak=aj();
        System.out.println("product of the two number is :" + ak);
    }
    static int aj(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int first=sc.nextInt();
        System.out.println("enter second number");
        int sec=sc.nextInt();
        int sum= (first *sec);

        return sum;
        }
    }

