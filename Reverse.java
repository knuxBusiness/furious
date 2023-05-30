import java.util.Arrays;
public class Reverse {
    public static void main(String[] args) {
        Reverse obj=new Reverse();
        int[] arr={4,6,1,3,5};
        obj.rev(arr);
    }
    public void rev(int[] arr){
        int temp;
        int i=0;
        for(;i<arr.length/2;i++){
            int end=arr.length-i-1;
            temp=arr[i];
            arr[i]=arr[end];
            arr[end]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
