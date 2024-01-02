/**
 * This class displays a a counter control loop
 * and a simpler way of writing it
 */

public class WhileCounter {
    public static void main(String[] args) {
        int counter2 =0;

        int counter = 1;
        while (counter <= 10) {
            System.out.print(counter); // printf() may serve
            counter++; // ++counter will still work
        }
        System.out.println();

        while (++counter2 <= 10) {
            System.out.printf("%d ",counter2);
        }
    }

    // THE SIMPLER WAY OF WRITING THESAME WHILE COUNTER

}
