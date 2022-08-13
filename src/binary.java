public class binary {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,9,12,15,71,82,89};
        int target=71;
        int ans=binarysearch(arr,target);
        System.out.println(ans);
    }
    static int binarysearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        while(start <= end){
            int mid=start +(end-start)/2;

             if(target<arr[mid]){
                end=arr[mid]-1;
                return end;
            }
            else if(target>arr[mid]){
                start=arr[mid]+1;
                return start;
            }else{
                return mid;
             }
        }
        return -1;
    }
}
