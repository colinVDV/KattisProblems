import java.util.*;
public class shatteredCake {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int width = scan.nextInt();
int pieces = scan.nextInt();
int area = 0;

for (int i = 0; i < pieces; i++) {

int a = scan.nextInt();
int b = scan.nextInt();
area = area + a * b;
}
 System.out.print( area / width);
}
}