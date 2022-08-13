

public class greaterthan{
    public static void main(String[] args) {

    }

    public int nextGreatestlehtter(char[] letter, char target){
        int start=0;
        int end=letter.length-1;

        while(start <= end){
            int mid=start +(end-start)/2;

            if(target<letter[mid]){
                end=letter[mid]-1;
                return end;
            }
            else {
                 start=mid+1;
            }
        }
        return letter[start% letter.length];
}
}