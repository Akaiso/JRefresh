

public class DivisionCheck {
    public static void main(String[] args){
        for(int counter = 0; counter < 13; counter++){

            System.out.print((counter / 13));
        }

        int[] scores = {23,64,89,8,31,34,73,69,28,11,34,39,80};
        
        int sum = 0;

        for(int i : scores)
       sum = i + sum ;

       System.out.print(sum);

    }
}
