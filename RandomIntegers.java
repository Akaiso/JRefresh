import java.security.SecureRandom;;

public class RandomIntegers {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();

        for (int x = 0; x <= 20; x++) {
            int number = 1 + secureRandom.nextInt(6);
            System.out.printf("%d  ", number);

            if (x % 5 == 0)
                System.out.println();
        }
    }
}
