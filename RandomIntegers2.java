import java.security.SecureRandom;

public class RandomIntegers2 {
    public static void main(String[] args){

        SecureRandom randomNumber = new SecureRandom();

        int time1 = 0;
        int time2 = 0;
        int time3 = 0;
        int time4 = 0;
        int time5 = 0;
        int time6 = 0;

        for (int x = 0; x <= 6000000 ; x ++){

            int numberCheck = 1 + randomNumber.nextInt(6);

            switch(numberCheck){
                case 1 :
                ++time1;
                break;
                case 2 :
                ++time2;
                break;
                case 3 : 
                ++time3;
                break;
                case 4 :
                ++time4;
                break;
                case 5 :
                ++time5;
                break;
                case 6 :
                ++time6;
                break;
                default : System.out.print("On kolos! On kolos");
                break;
            }
        }
        System.out.printf("time1: %d \n time2: %d \n time3: %d \n time4: %d \n time5: %d \n time6: %d ", time1, time2, time3, time4, time5, time6);

    }
}
