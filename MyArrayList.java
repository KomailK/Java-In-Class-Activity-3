import java.util.ArrayList;
import java.util.Scanner;

public class MyArrayList {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  
        System.out.println("Insert numeric values with spaces between");
        String values = myObj.nextLine(); 
        System.out.println("Average number: "+Average(values));}

    public static int Average(String value1) {
        int res=0;
        String myArray[]= value1.split(" ");
        for(String element: myArray)
        {
            res+=Integer.parseInt(element);
        }
        return res/myArray.length;

    }
}

