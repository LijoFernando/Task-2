package task2;

import java.util.*;

public class SecondLargest {

    void findSecondLargest(int [] array,int size){
        Arrays.sort(array);
        System.out.println("The Second largest Element is: "+array[size-2]);

    }
}
