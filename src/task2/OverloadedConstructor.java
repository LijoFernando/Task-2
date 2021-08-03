package task2;

public class OverloadedConstructor {
    public OverloadedConstructor(){
        System.out.println("Empty Constructor");
    }
    public  OverloadedConstructor(String bookName){
        System.out.println("Book Name: "+bookName);
    }
    public  OverloadedConstructor(String bookName,int bookPrice){
        System.out.println("Book Name: "+bookName+", Book Price: "+bookPrice);
    }
}
