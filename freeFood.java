import java.util.Scanner;
public class freeFood {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int events = scan.nextInt();
        boolean[] year = new boolean[366];
            for (int i = 0; i < events; i++) {
                int start  = scan.nextInt();
                int end = scan.nextInt();
                for (int j = 1; j<= 365; j++) {
                    if(j>=start && j<=end) {
                        year[j] = true;
                    }
                }
            }
            int count = 0;
            for (int i = 1; i<=365; i++) {
                if (year[i]==true) {
                    count++;
                }
            }

            System.out.println(count);






        scan.close();
    }
}