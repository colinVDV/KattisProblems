//link to the kattis problem: https://open.kattis.com/problems/justaminute

import java.util.*;

public class justAMinute {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int instances = scan.nextInt();
        double count = 0;
        double minutesWatched = 0;
        double secondsPassed = 0;
        for (int i = 0; i < instances; i++) {
            minutesWatched += scan.nextDouble() * 60;
            secondsPassed += scan.nextDouble();
        }
        scan.close();
        count = secondsPassed / minutesWatched;

        if (count > 1) {
            System.out.println(count);
        } else {
            System.out.println("measurement error");
        }
    }
}