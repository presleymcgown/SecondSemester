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

    public static int recursiveBinarySearch(int[] arr, int target, int left, int right){



        if(left > right){

            return -1;

        } else {

            int mid = (left + right) / 2;

            if (mid == target) {

                return mid;

            }

            if(arr[mid] > target){

                //left half

                recursiveBinarySearch(arr, target, left, mid - 1);

            }

            if(arr[mid] < target){

                //right half

                recursiveBinarySearch(arr, target, mid + 1, right);

            }

        }



        return -1;

    }

    public static int q1(int[] arr, int target){

        int left = 0;
        int right = arr.length - 1;

        while (left <= right){

            int mid = (left + right) / 2;

            if(arr[mid] == target){

                System.out.println(mid);
                return mid;
            }

            if(arr[mid] > target){

                right = mid - 1;

            }

            if(arr[mid] < target){

                left = mid + 1;

            }

        }

        System.out.println(-1);
        return -1;

    }

    public static double q2(double[] arr, double target){

        int left = 0;
        int right = arr.length - 1;

        while (left <= right){

            int mid = (left + right) / 2;

            if(arr[mid] == target){

                System.out.println(mid);
                return mid;
            }

            if(arr[mid] > target){

                right = mid - 1;

            }

            if(arr[mid] < target){

                left = mid + 1;

            }

        }

        System.out.println(-1);
        return -1;

    }

    public static int q3(short[] arr, short target){

        int left = 0;
        int right = arr.length - 1;

        while (left <= right){

            int mid = (left + right) / 2;

            if(arr[mid] == target){

                if(arr[mid + 1] == target){

                    int middle = mid;

                    for (int i = 1; i < arr.length; i++) {

                        if(arr[middle + i] == target){

                            mid += 1;

                        }else{

                            break;

                        }

                    }

                }

                System.out.println(mid);
                return mid;
            }

            if(arr[mid] > target){

                right = mid - 1;

            }

            if(arr[mid] < target){

                left = mid + 1;

            }

        }

        System.out.println(-1);
        return -1;
    }

    public static int q4(String[] arr, String target){


        int left = 0;
        int right = arr.length - 1;

        while (left <= right){

            int mid = (left + right) / 2;

            if(arr[mid].equals(target)){

                int first = mid;

                int middle = mid;

                if(arr[mid + 1].equals(target)){


                    for (int i = 1; i < arr.length; i++) {

                        if(arr[middle + i].equals(target)){

                            mid += 1;

                        }else{

                            break;

                        }

                    }

                }

                System.out.println(mid - first);
                return mid;
            }


           if(arr[mid].compareTo(target) < 0){

             right = mid - 1;

            }

            if(arr[mid].compareTo(target) > 0){

                left = mid + 1;

            }

        }


        System.out.println(-1);
        return -1;

    }

}
