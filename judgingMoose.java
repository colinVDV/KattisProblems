import java.util.Scanner;
public class judgingMoose {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int left = scan.nextInt();
        int right = scan.nextInt();
        scan.close();
        if(left + right == 0) {
            System.out.println("Not a moose");
        }

        else if (left == right) {
            int total = left *2;            
            System.out.println("Even " + total);
        }

        else if (left < right) {
            int total = right *2;            
            System.out.println("Odd " + total);
        }

        else if (left > right) {
            int total = left *2;            
            System.out.println("Odd " + total);
        }
    }
}