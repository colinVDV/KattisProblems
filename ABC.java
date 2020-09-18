
//Kattis problem: https://open.kattis.com/problems/abc
import java.util.*;

public class ABC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] myArray = new int[3];
        String temp = "";

        for (int i = 0; i < 3; i++) {
            myArray[i] = scan.nextInt();
        }

        Arrays.sort(myArray);
        temp = scan.next();

        for (int i = 0; i < 3; i++) {
            if (temp.charAt(i) == 'C') {
                System.out.print(myArray[2] + " ");
            } else if (temp.charAt(i) == 'B') {
                System.out.print(myArray[1] + " ");
            } else {
                System.out.print(myArray[0] + " ");
            }
        }

    }
}