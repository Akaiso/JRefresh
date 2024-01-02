/*Sum even numbers between 0 to 20 */

public class EvenSum {
    public static void main(String[] args){
        int sum = 0;
        for(int x = 0; x <= 20 ; x++){
            if(x % 2 == 0){
                System.out.print(x);
                sum = sum + x ; // sum += x;
            }
        }
        System.out.print(sum);

        //the for loop can be mashed up to this which is highly discouraged for readability
        // for(int x = 0; x <= 20; sum += x; x += 2)
        //   ; //this is an empty statement
    }
}
