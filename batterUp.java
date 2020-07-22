import java.util.Scanner;
public class batterUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bats = scan.nextInt();
        double total = 0;
        int divider = 0;
        for (int i = 0; i < bats; i++) {
            double temp = scan.nextDouble();
            if (temp >= 0) {
            total += temp;
            divider++;
            }
        }
        scan.close();
        double average = total / divider;
        System.out.println(average);
    }
}