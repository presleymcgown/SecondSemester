public class DataManager {

    private MedicalRecord[] records;

    public DataManager(){
        records = new MedicalRecord[40];
    }

    public void addRecord(MedicalRecord mr){

        records[lastFilledIndex() + 1] = mr;

    }

    public void removeRecord(MedicalRecord mr){

        for (int i = 0; i < lastFilledIndex(); i++) {

            if(records[i].getId() == mr.getId()){

                records[i] = null;

                for (int j = records.length-1; j >= i; j--) {

                    records[j-1] = records[j];

                }

                break;
            }
        }

    }

    private int getRecordIndex(String lastName, String firstName){

        for (int i = 0; i < lastFilledIndex(); i++) {

            if(records[i].equals(lastName) && records[i].equals(firstName)){
                return i;
            }

        }

        return -1;
    }

    public void sortRecords(){

        for (int i = 0; i < records.length-1; i++) {

            int minIndex = i;

            for (int j = 1; j < lastFilledIndex(); j++) {

                if(records[j].getId() < records[i].getId()){
                    minIndex = j;
                }

            }

            MedicalRecord temp = records[minIndex];
            records[minIndex] = records[i];
            records[i] = temp;
        }
    }

    public int lastFilledIndex(){

        int i = 0;

        while(records[i] != null){

            i++;

        }

        return i;
    }


}