public class IterativeSorting {


    /**
     * Time complexity: o(n^2)
     * @param arr
     */
    public static void selectionSort(int[] arr){

        // what is a swap?
        // store the value you are about to move
        // then you swap the values
        // then you take the stored value and put it where it should be


        for (int i = 0; i < arr.length - 1; i++) {

            // store smallest thing
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {

                // if we find a new smaller thing, update the smallest thing
                if(arr[j] < arr[minIndex]){

                    minIndex = j
;
                }

            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }

    }

    public static void bubbleSort(int[] arr){

        for (int i = 1; i < arr.length - 1; i++) {


            for (int j = i + 1; j < arr.length; j++) {

                if(arr[j] > arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }

            }

        }

    }

}
