package task2;

import java.util.Arrays;

public class SegregateArray {
    void segregatearray(int[] array,int size){
            System.out.println(Arrays.toString(array));
            Arrays.sort(array);
            System.out.println("Segregated Array: "+Arrays.toString(array));
    }
}
