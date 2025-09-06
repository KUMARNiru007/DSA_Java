package LeetcodeImp;
import java.util.Arrays;
public class Main {
    
    public static void main(String args[]){
        int[] arr = new int[]{2,1,2};


        int low=0;
        int high=arr.length-1;
        int i =0;
        while(i<=high){
            if(arr[i] == 2){
                int temp = arr[i];
                arr[i]=arr[high];
                arr[high]=temp;
                high--;
            }
            else if(arr[i]==0){
                int temp = arr[i];
                arr[i]= arr[low];
                arr[low]=temp;
                low++;
                i++;
            }
            else {
                // ignore 1;
                i++;

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}