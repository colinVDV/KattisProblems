import java.util.*;

public class Trik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String moves = scan.next();
        int n = moves.length();
        int pos = 1;
        char move = ' ';
        for (int i = 0; i < n; i++) {
            move = moves.charAt(i);
            if (pos == 1) {
                if (move == 'A') {
                    pos = 2;
                }
                if (move == 'C') {
                    pos = 3;
                }
            }

            else if (pos == 2) {
                if (move == 'A') {
                    pos = 1;
                }
                if (move == 'B') {
                    pos = 3;
                }
            }

            else if (pos == 3) {
                if (move == 'B') {
                    pos = 2;
                }
                if (move == 'C') {
                    pos = 1;
                }
            }
        }
        System.out.print(pos);
    }
}
