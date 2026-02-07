package proj;
import java.util.ArrayList;

public class Merge {
    public ArrayList<Integer> MergeArrays  (ArrayList<Integer> array1, ArrayList<Integer> array2){
        //initialize variables for merging
        ArrayList<Integer> resultArray = new ArrayList<>();
        int i = 0;
        int j = 0;
        int keyi;
        int keyj;

        //While both the arrays are full insert largest into resultArray
        while(i < array1.size() && j < array2.size()){
            keyi = array1.get(i);
            keyj = array2.get(j);
            if(keyi < keyj){
                resultArray.add(keyi);
                i++;
            }else{
                resultArray.add(keyj);
                j++;
            }
        }
        //Empty out elements from array1 and array2
        while(i < array1.size()){
            resultArray.add(array1.get(i));
            i++;
        }
        while(j < array2.size()){
            resultArray.add(array2.get(j));
            j++;
        }

        return resultArray;

    }
}
