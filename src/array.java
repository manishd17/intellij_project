import java.util.Scanner;
public class array {
    public static void main(String[] args) {
      int shivam=manish();
        System.out.println(shivam);
        int shiva=manish();
        System.out.println(shiva);
    }
    static int manish(){
    Scanner sc=new Scanner(System.in);
    int first =sc.nextInt();
    int sec=sc.nextInt();
    int sum=first  + sec;
    return sum;
    }

}
