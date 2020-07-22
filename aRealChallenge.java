import java.lang.Math;
import java.util.Scanner;

public class aRealChallenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double area = scan.nextDouble();
        scan.close();
        double fenceLength = Math.sqrt(area) * 4;
        System.out.println(fenceLength);
    }
}