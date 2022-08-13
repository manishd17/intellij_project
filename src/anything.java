import java.util.Arrays;
import java.util.Scanner;
public class anything {
    public static void main(String[] args) {
      mj();
    }
    static void mj(){
        Scanner sc=new Scanner(System.in);
        int od=sc.nextInt();

         if(od % 2==0){
             System.out.println("even number");
         }else{
             System.out.println("odd number");
         }
    }
}
