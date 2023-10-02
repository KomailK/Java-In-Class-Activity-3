import java.util.ArrayList;
import java.util.Scanner;

public class MyArrayList {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Insert numeric values");
        String values = myObj.nextLine();  // Read user input
        System.out.println("Total number: "+Convert(values));}

    public static int Convert(String value1) {
        int res=0;
        String myArray[]= value1.split(" ");
        for(String element: myArray)
        {
            res+=Integer.parseInt(element);
        }
        return res/myArray.length;

    }
}

