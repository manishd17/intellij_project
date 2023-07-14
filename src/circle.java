import java.lang.String;
import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
        //Enter the radius and it will calculate the circumference of the circle!!
        String man=mj();
        System.out.println("the area and circumference of circle are :"+man);
    }
    static String mj(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius");
        Double rad=sc.nextDouble();
        Double area= Math.PI*(rad*rad) ;
        double cir= Math.PI*2* rad;


        return area+" "+cir;
    }


}
