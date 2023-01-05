public class LinearSearch{

    public int Search(String[] list, String target){

        for (int i = 0; i < list.length; i++) {

            if(target == list[i]){

                System.out.println(i);
                return i;

            }

        }

        System.out.println("-1");
        return -1;

    }

}
