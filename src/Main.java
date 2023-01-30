public class Main {

    public static LinearSearch linearSearch;
    private static String[] list;
    private static String target;


    public static void main(String[] args) {

        int[] arr = {3,2,1,5,4};

        RecursiveSorting.heapSort(arr);

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);

        }

    }

}
