import java.util.Arrays;

class mergesort
{
    public static void main(String[] args)
    {
     int[] arr = {2,4,1,6,8,5,3,7};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));   
}
static int[] mergeSort(int[] arr)
{
    if (arr.length == 1)
    {
        return arr;
    }
    int mid = arr.length / 2;
    int[] left =mergeSort(Arrays.copyOfRange(arr, 0, mid));
    int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
    return merge(left, right);
}

private static int[] merge(int[] first ,int[] second)
{
    int [] miv =new int[first.length + second.length];
    int i=0;
    int j=0;
    int k=0;
    while(i<first.length && j<second.length)
    {
        if(first[i]<second[j])
        {
            miv[k]=first[i];
            i++;
        }
        else
        {
            miv[k]=second[j];
            j++;
        }
        k++;
    }
    while(i<first.length)
    {
        miv[k]=first[i];
        i++;
        k++;
    }   
    while(j<second.length)
    {
        miv[k]=second[j];
        j++;
        k++;
    }
    return miv;
}
}