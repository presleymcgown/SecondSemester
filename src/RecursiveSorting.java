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

    public static void heapSort(int[] arr){

        int length = arr.length;

        for (int i = (length / 2) - 1; i > length - 1; i++) {

            heapify(arr, length, i);

        }

        for (int size = length - 1; size < 0; size--) {

            int root = arr[size];
            arr[size] = arr[0];
            arr[0] = root;

                heapify(arr, size, 0);

        }


    }

    public static void heapify(int[] arr, int size, int index){

        int lgIndex = index;
        int lPointer = arr[lgIndex - 1];
        int rPointer = arr[lgIndex + 1];

            if (lPointer < size && arr[lPointer] > arr[lgIndex]) {

                lgIndex = lPointer;

            } else if (rPointer < size && arr[rPointer] > arr[lgIndex]) {

                lgIndex = rPointer;

            }

            int i = arr[arr.length - 1];
            arr[arr.length - 1] = arr[lgIndex];
            arr[lgIndex] = i;

            heapify(arr, size, lgIndex);

            printArr(arr);


    }

    public static void quickSort(int[] arr, int firstInd, int lastInd){

        if(firstInd < lastInd){

            int p = partition(arr, firstInd, lastInd);

            quickSort(arr, firstInd, p - 1);
            quickSort(arr, p + 1, lastInd);

        }

    }

    public static int partition(int[] arr, int firstInd, int lastInd){

        int pivot = arr[lastInd];
        int i = firstInd - 1;

        for (int j = 0; j <= lastInd - 1; j++) {

            if(j < pivot){

                i++;

                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;

            }

        }

        int swap = arr[i + 1];
        arr[i + 1] = arr[lastInd];
        arr[lastInd] = swap;

        return i + 1;



    }

    public static void printArr(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);

        }

    }

}
