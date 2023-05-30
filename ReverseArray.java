import java.util.Arrays;
public class ReverseArray{
    static void reverse(int[] arr,int start,int end){
        int temp;
        if(start>end){
            return;
        }
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        reverse(arr,start+1,end-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ReverseArray.reverse(arr,0,4);
        System.out.println(Arrays.toString(arr));
    }
}