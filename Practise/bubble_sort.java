import java.util.Arrays;

public class bubble_sort
{
    public static void main(String[] args) {
        int[] arr = {-1,20,0,4,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr)
    {
        boolean swapped;
        // Run the steps n-1 times
        for (int i = 0; i < arr.length - 1; i++)
        {
            swapped =false;
            // For each pass, the maximum item will be placed at the correct position
            for (int j = 1; j < arr.length - i; j++)
            {
                // Swap if the current item is smaller than the previous item
                if (arr[j] < arr[j - 1])
                {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped =true;
                }
            }
            //if you did not swap fora  particular value of i, it means
            // tha array is sorted hence stop the program 
            if (swapped == false)
            break;
        }
    }
}
