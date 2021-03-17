public class BinSearch {

    public static void main(String args[])
    {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int key=1;
        int low=0;
        int high=arr.length-1;
        while(high>=low)
        {
            int middle=(low+high)/2;
            if(arr[middle]==key) {
                System.out.println(middle);
                break;
            }
           if(arr[middle]<key)
               low=middle+1;
            if(arr[middle]>key)
                high=middle-1;

        }
    }
}
