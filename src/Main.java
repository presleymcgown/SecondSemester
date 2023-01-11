public class Main {

    public static LinearSearch linearSearch;
    private static String[] list;
    private static String target;


    public static void main(String[] args) {

        int[] grades = {60, 70, 75, 80, 85, 90, 95};
        int target1 = 80;

        BinarySearch.q1(grades, target1);

        double[] atomicWeights = {1.0079, 4.0026, 6.941, 6.941, 9.0122, 10.811, 12.0107, 12.0107, 14.0067};
        double target2 = 12.0107;

        BinarySearch.q2(atomicWeights, target2);

        short[] dates = {1492, 1776, 1803, 1861, 1861, 1861, 1945};
        short target3 = 1861;

        BinarySearch.q3(dates, target3);

        String[] patientNames = {"Brown", "Johnson", "Johnson", "Johnson", "Johnson", "Jones", "Smith", "Williams"};
        String target4 = "Johnson";
        BinarySearch.q4(patientNames, target4);

    }

}
