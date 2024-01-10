//class to write and test code snippets

import java.util.ArrayList;
import java.util.Arrays;

public class Scratch {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        names.add("james");
        names.add(1, "Peter");
        String first = names.get(0);
        System.out.print(first);


        // int[][] b = {{1,2}, {3,4}};
        // //int[] sequence = {1,2,3,4};
        // int[][] c = {{2,5,4}, {7,3,9}, {2,8,1}};
        // System.out.printf("This is array c : %s", Arrays.deepToString(c));
        // System.out.println();
        // System.out.print(c[1][2]);
        // //System.out.printf("This is array b: ", Arrays.deepToString(b) );

        int[][] c = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        System.out.println(c.length);

        System.out.print(args.length);

        
    }

}
