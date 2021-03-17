public class BinarySearch {

    public static void main(String args[])
    {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=4;
        int index=search(arr,target,0,arr.length-1);

        System.out.println("index of the element is"+index);

    }

    public static int  search(int[] arr,int target,int first, int last)
    {
            int mid = (first + last)/ 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                return search(arr, target, first, mid - 1);
            } else {
                return search(arr, target, mid + 1, last);

        }
    }

}
