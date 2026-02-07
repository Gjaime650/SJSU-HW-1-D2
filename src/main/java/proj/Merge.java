package proj;
import java.util.ArrayList;

public class Merge {
    public ArrayList<Integer> MergeArrays  (ArrayList<Integer> array1, ArrayList<Integer> array2){
        ArrayList<Integer> resultList = new ArrayList<>();
        int i = 0;
        int j = 0;
        int keyi;
        int keyj;

        while(i < array1.size() && j < array2.size()){
            keyi = array1.get(i);
            keyj = array2.get(j);
            if(keyi < keyj){
                resultList.add(keyi);
                i++;
            }else{
                resultList.add(keyj);
                j++;
            }
        }
        while(i < array1.size()){
            resultList.add(array1.get(i));
            i++;
        }
        while(j < array2.size()){
            resultList.add(array2.get(j));
            j++;
        }
        for(int k = 0; k < resultList.size(); k++){
            System.out.println(resultList.get(k));

        }
        return resultList;

    }
}
