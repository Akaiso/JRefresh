import java.util.ArrayList;
import java.util.Arrays;

import javax.print.attribute.SupportedValuesAttribute;


//Initializing Two-dimensional array



public class InitTwoDimensionalArray {
    public static void main(String[] args){



        int[][] array1 = {{1,2,3}, {4,5,6}};
        int[][] array2 = {{1,2}, {3}, {4,5,6}};

        System.out.println("Values in array1 by row are: ");
        outputArray(array1); //displays array1 by row

        System.out.printf("%nValues in array2 by row are%n");
        outputArray(array2); // displays array2 by row

    }

    public static void outputArray(int[][] array){
        //loop through array's rows
        for(int row = 0; row < array.length; row++){
            //loop through columns of current row
            for(int column = 0; column < array[row].length; column++)
            System.out.printf("%d ", array[row][column]);
            System.out.println();
        }
    }
}
