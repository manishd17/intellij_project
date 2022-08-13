public class practisebinary {
    public static void main(String[] args) {
        int[] arr={12,13,15,22,45,56,87,89,349};
        int target=89;
       int ans= binarynumber(arr,target);
       System.out.println(ans);
    }
     static  int binarynumber(int[] arr,int target){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
     }
}
