//https://open.kattis.com/problems/fiftyshades
import java.util.Scanner;

public class fiftyShadesOfPink {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int entries = scan.nextInt();
        int count = 0;
        for (int i = 0; i < entries; i++) {
            String temp = scan.next().toLowerCase();
            if (temp.contains("pink") || temp.contains("rose")) {
                count++;
            }
        }
        scan.close();
        if (count != 0) {
            System.out.println(count);
        } else {
            System.out.println("I must watch Star Wars with my daughter");
        }
    }

}