import java.util.Arrays;
import java.util.Scanner;
public class bmw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr={23,535,625,53626,633};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] arr){
        arr[3]=54;
    }
    }

