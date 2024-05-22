package homework;
/**
 * Write a Java program to create a new array list, add some colours (string)
 * and printout the collection using for each loop.
 */
import java.util.ArrayList;

public class Programme_4_ColourArrayList {
    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("Green");
        colorList.add("Yellow");
        colorList.add("Purple");
        colorList.add("orange");
        colorList.add("Cyan");
        colorList.add("White");
        for (String colourList : colorList) {
            System.out.println(colourList + " ,");
        }

    }
}
