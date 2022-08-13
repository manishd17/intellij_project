import java.util.Arrays;
public class change {
    public static void main(String[] args) {
      int arr []={1,2,34,45,56};
      mj(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void mj(int[] nums){
        nums[0]=100;
    }
}
