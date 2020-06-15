import java.util.*;
public class roamingRomans {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

double x = scan.nextDouble();
int result = (int)Math.round(((x*1000.0000)*(5280.0000/4854.0000)));
System.out.print(result);
}

}