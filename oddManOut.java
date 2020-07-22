import java.util.*;
public class oddManOut {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        ArrayList <Integer> odds = new ArrayList<Integer>();
        for (int i = 0; i < cases; i++) {
            int instances = scan.nextInt();
            int[] couples = new int[instances];
                for (int j = 0; j < instances; j++) {
                    couples[j] = scan.nextInt();
                }
                Arrays.sort(couples);
            if (couples[0] != couples [1]) {
                odds.add(couples[0]);
            } else if (couples[couples.length - 1] != couples[couples.length -2]) {
                odds.add(couples[couples.length - 1]);
            } else {
                for (int c = 1; c < couples.length - 2; c++) {
                    if (couples[c] != couples[c+1] && couples [c] != couples[c-1]) {
                        odds.add(couples[c]);
                    }
                }
            }
            int number = i+1;
            System.out.println("Case #" + number + ": " + odds.get(i));
        }


        scan.close();
    }
}