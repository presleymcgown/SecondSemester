public class BinarySearch {

    public static int interativeBinarySearch(int[] arr, int target){

        //set up for the split

        int leftPointer = 0;
        int rightPointer = arr.length - 1;

        // as long as we have data left to search

        while (leftPointer <= rightPointer){

        // find the middle
            int mid = (leftPointer + rightPointer) / 2;
        // if the middle index contains the target
            if(arr[mid] == target){
                return mid;
            }
        // if it does, return
        // if not:
            // determine if the target is in the left half or right half
                // adjust pointers and repeat

            if(arr[mid] > target){
                //left half

                rightPointer = mid - 1;

            }

            if(arr[mid] < target){
                //right half

                leftPointer = mid + 1;

            }

         }

        return -1;
    }

}
