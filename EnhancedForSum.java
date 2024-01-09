//using the enhanced for loop to summ the elements in an array of students scores


public class EnhancedForSum {
    public static void main(String[] args){
        int[] scores = {23,64,89,8,31,34,73,69,28,11,34,39,80};
        int total = 0;

        //conventional for loop
        for(int x = 0; x < scores.length; x++)
        total = total + scores[x];
        System.out.println(total);

        System.out.println();
        
       //enhanced for loop swag
        int sum = 0;

        for(int i : scores)
       sum = i + sum ;

       System.out.print(sum);
    }
}
