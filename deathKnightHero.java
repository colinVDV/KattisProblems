/**
Input
----------
You are given a recording of the abilities our hero used in his battles.
The first line of input will contain a single integer n (1≤n≤100), the number of battles our hero played.
Then follow n lines each with a sequence of ki (1≤ki≤1000) characters, each of which are either ’C’, ’D’ or ’O’. 
These denote the sequence of abilities used by our hero in the i-th battle. ’C’ is Chains of Ice, ’D’ is Death Grip and ’O’ is Obliterate.

Output
--------
Output the number of battles our hero won, assuming he won each battle where he did not use Chains of Ice immediately followed by Death Grip.

Sample Input:
3
DCOOO
DODOCD
COD

Sample Output:
2
**/


import java.util.*;
public class deathKnightHero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int battles = scan.nextInt();
        int wins = 0;

        for (int i = 0; i < battles; i++) {
            String combatMoves = scan.next();
            boolean win = true;
            char[] ch = combatMoves.toCharArray();
                for (int j = 0; j < ch.length - 1; j++) {
                    if (ch[j] == 'C' && ch[j+1] =='D') {
                        win = false;
                    }
                }
                if (win == true) {
                    wins = wins + 1;
                }
        }
        System.out.print(wins);
        scan.close();
    }
    
}