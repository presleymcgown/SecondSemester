public class RecursiveSorting {

    /// region Merge

    public static void mergeSort(int[] arr, int l, int r){

        // check if there is any array left to sort/split

        if(l < r){

            // calculate the middle
            int mid = (l + r) / 2;
            // call mergeSort() on both halves
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);

            // call merge() on the half this run of the method is dealing with
            merge(arr, l, mid, r);

        }

    }

    private static void merge(int[] mainarr, int l, int mid, int r){

        // find the sizes of two sub-arrays that are to be merged

        int n1 = mid - l + 1;
        int n2 = r - mid;

        // create two temporary arrays, one or the left sub array and one for the right

        int[] leftSub = new int[n1];
        int[] rightSub = new int[n2];

        // copy data from the main array to the sub arrays

        for (int i = 0; i < n1; i++) {

            leftSub[i] = mainarr[l + i];

        }

        for (int i = 0; i < n2; i++) {

            rightSub[i] = mainarr[mid + 1 + i];

        }

        // actually merge the temporary arrays

        // get the initial indices of the first and second sub arrays

        int i = 0; // left pointer
        int j = 0; // right pointer

        // initial index of the merged array

        int k = l;

        // do the actual sorting

        while (i < n1 && j < n2){

            // see which value is bigger

            if(leftSub[i] <= rightSub[j]){

                // copy the smaller value into the main array

                mainarr[k] = leftSub[i];

                // increment the correct pointer

                i++;

            }else{

                // copy the smaller value into the main array

                mainarr[k] = rightSub[j];

                // increment the correct pointer

                j++;

            }


            k++;

        }

        // copy any extra data directly into the array (it does not get sorted)

        while(i < n1){

            mainarr[k] = leftSub[i];
            i++;
            k++;

        }

        while(j < n2){

            mainarr[k] = rightSub[i];
            j++;
            k++;

        }

    }

    /// endregion

}
