import java.util.*;
public class numberFun {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int loops = scan.nextInt();
double a = 0;
double b = 0;
double c = 0;


for (int i = 0; i < loops; i++) {
 a = scan.nextDouble();
 b = scan.nextDouble();
 c = scan.nextDouble();

if(a - b == c) {
System.out.println("Possible");
}

else if(a + b == c) {
System.out.println("Possible");
}

else if(b - a == c) {
System.out.println("Possible");
}

else if(a * b == c) {
System.out.println("Possible");
}

else if(a / b == c) {
System.out.println("Possible");
}

else if(b / a == c) {
System.out.println("Possible");
}
else {
System.out.println("Impossible");
}


}

}

}