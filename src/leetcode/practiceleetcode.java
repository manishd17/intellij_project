package leetcode;

public class practiceleetcode {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(5));


    }
    public static boolean isPerfectSquare(int num) {
        int start=0;
        int end=num;
        while(start<=end){
            int mid=start+(end-start)/2;
            int t=mid*mid;
            if(t==num){
                return true;
            } else if (t<num) {
                start=mid+1;
            }else{
                end=mid-1;
            }

            }return false;
        }

}