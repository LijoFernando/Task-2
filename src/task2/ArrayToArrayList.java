package task2;

import java.util.ArrayList;

public class ArrayToArrayList {
    void convertToArray(int []array, int size ){

        ArrayList<Integer> arrayList = new ArrayList<>(size);
        for(int elements : array){
            arrayList.add(elements);
        }
        System.out.println("After Array to ArrayList Conversion"+"\n"+arrayList);

    }
}
