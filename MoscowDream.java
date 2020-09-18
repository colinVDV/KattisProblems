
//kattis problem: https://open.kattis.com/problems/moscowdream
import java.util.*;

public class MoscowDream {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int easy = scan.nextInt();
        int medium = scan.nextInt();
        int hard = scan.nextInt();
        int total = scan.nextInt();
        scan.close();
        int sum = medium + hard + easy;

        if (easy == 0 || medium == 0 || hard == 0 || sum < total || total < 3) {
            System.out.print("NO");
        } else {
            System.out.print("YES");
        }

    }
}