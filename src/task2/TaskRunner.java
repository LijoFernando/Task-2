package task2;



import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.*;

public class TaskRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int[] array;
        System.out.println("1.Find Second larget Element in Array"
                + "\n2.Segregate Array 0 on left and 1 on right"
                + "\n6.Array to arraylist conversion"
                + "\n7.Pojo classes"
                + "\n8.Constructor overloading"
                + "\n9.Enum for Rainbow"
                + "\n10.File creation");
        System.out.println("Choose the program number to Execute(1,2,6 to 10):");
        int programNo = input.nextInt();
        switch (programNo) {
            case 1:
                //Second Largest Element in Array
                System.out.println("Enter the Array size");
                size = input.nextInt();
                array = new int[size];
                System.out.println("Enter the Array Elements");
                for (int i=0; i< size; i++){
                    array[i] = input.nextInt();
                }
                SecondLargest findSecondLarge = new SecondLargest();
                findSecondLarge.findSecondLargest(array, size);
                break;
            case 2:
                //Segregate 0 on left 1 on right in array
                System.out.println("Enter Array Size");
                size = input.nextInt();
                array = new int[size];
                for(int i=0; i<size; i++){
                array[i]=input.nextInt();
                }
                SegregateArray arraySegregation =new SegregateArray();
                arraySegregation.segregatearray(array,size);
                break;
            case 3:
//                System.out.println("Enter the Array size");
//                size = input.nextInt();
//                array = new int[size];
//                System.out.println("Enter the Array Elements");
//                for (int i=0; i< size; i++){
//                    array[i] = input.nextInt();
//                }
//                SortMaxMin sortOfMaxMin = new SortMaxMin();
//                sortOfMaxMin.sortArray(array,size);
            case 6:
                //Convert Array to Arraylist
                System.out.println(" Enter the size of Array : ");
                size = input.nextInt();
                array = new int[size];
                System.out.println(" Enter the Array Value ");
                for(int i=0; i<size; i++){
                    array[i] = input.nextInt();
                }
                ArrayToArrayList ArrayListObj = new ArrayToArrayList();
                ArrayListObj.convertToArray(array,size);
                break;
            case 7:
                //POJO Class
                PojoClass obj = new PojoClass();
                obj.setBookId(2);
                obj.setBookPrice(901);
                obj.setBookName("Java The Complete Reference - Eleventh Edition");
                obj.setAuthorName("Herbert Schildt");
                obj.setISBN(9003445143452l);
                System.out.println(obj);
                break;
            case 8:
                //Three Overloaded Constructor
                new OverloadedConstructor();
                new OverloadedConstructor("JAVA PROGRAMMING");
                new OverloadedConstructor("C++",255);
                break;
            case 9:
                //enum for Rainbow Colors
                EnumRainbow raninbowEnum = new EnumRainbow();
                raninbowEnum.printColor();
                break;
            case 10:
                //File Creation

                try{
                    CreateFile fileCreate = new CreateFile();
                    fileCreate.fileCreation();
                } catch (FileAlreadyExistsException e){
                    System.out.println(e);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;


        }
    }
}