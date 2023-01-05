public class Main {

    public static LinearSearch linearSearch;
    private static String[] list;
    private static String target;


    public static void main(String[] args) {

        list = new String[]{"Alice", "Bob", "Charlie", "David", "Eve"};
        target = "Charlie";

        linearSearch = new LinearSearch();
        linearSearch.Search(list, target);

    }

}
