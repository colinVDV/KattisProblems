
//kattis problem: https://open.kattis.com/problems/babybites
import java.util.*;

public class babyBites {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int instances = scan.nextInt();
        String temp = "";
        int count = 1;
        boolean check = true;

        for (int i = 0; i < instances; i++) {
            temp = scan.next();
            if (temp.compareTo("mumble") != 0) {
                int bite = Integer.parseInt(String.valueOf(temp));
                if (bite != count) {
                    check = false;
                }
            }
            count++;
        }
        if (check) {
            System.out.print("makes sense");
        } else {
            System.out.print("something is fishy");
        }

    }
}