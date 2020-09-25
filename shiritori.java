
//Kattis problem: https://open.kattis.com/problems/shiritori
import java.util.*;

public class shiritori {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<String> list = new HashSet<String>();
        int words = scan.nextInt();
        boolean fair = true;
        int turn = 0;
        char current = ' ';

        for (int i = 0; i < words && fair; i++) {
            String temp = scan.next();
            if (list.contains(temp)) {
                fair = false;
            }
            if (i != 0 && temp.charAt(0) != current) {
                fair = false;
            }
            current = temp.charAt(temp.length() - 1);
            list.add(temp);
            turn++;
        }

        if (fair) {
            System.out.print("Fair Game");
        } else if (turn % 2 == 1) {
            System.out.print("Player 1 lost");
        } else {
            System.out.print("Player 2 lost");
        }

        scan.close();
    }
}
