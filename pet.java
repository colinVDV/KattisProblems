import java.util.*;

public class pet {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int contestants = 5;
int winnerScore = 0;
int winnerNr = 1;
for(int i = 0; i < 5; i++) {
int total = 0;
total = scan.nextInt() + scan.nextInt() + scan.nextInt() + scan.nextInt();
if (total > winnerScore) {
winnerScore = total;
winnerNr = i + 1;
}
}

System.out.print(winnerNr + " " + winnerScore);
}

}