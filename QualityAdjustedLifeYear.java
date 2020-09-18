import java.util.*;

public class QualityAdjustedLifeYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int instances = scan.nextInt();
        double count = 0;
        double a = 0;
        double b = 0;

        for (int i = 0; i < instances; i++) {
            a = scan.nextDouble();
            b = scan.nextDouble();
            count = count + a * b;
        }

        scan.close();

        System.out.print(count);
    }
}