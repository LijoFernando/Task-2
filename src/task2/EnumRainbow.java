package task2;

enum Color {
    RED(1), ORANGE(2), YELLOW(3), GREEN(4), BLUE(5), INDIGO(6), VIOLET(7);
    int code;
    Color(int colorCode){
        this.code=colorCode;
    }
}
public class EnumRainbow {
    void printColor(){
        for (Color colors:Color.values()) {
            System.out.println("Color code of "+colors+" is "+colors.code);
        }
    }



}
