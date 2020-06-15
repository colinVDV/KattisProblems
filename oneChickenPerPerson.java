import java.util.*;
public class oneChickenPerPerson {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int x = scan.nextInt();
int y = scan.nextInt();
int difference = Math.abs(x-y);

if (x > y) {
if (difference == 1){
System.out.print("Dr. Chaz needs 1 more piece of chicken!");
} else {
System.out.print("Dr. Chaz needs "+ difference +" more pieces of chicken!");
}
}

else if (y > x) {
if (difference == 1){
System.out.print("Dr. Chaz will have 1 piece of chicken left over!");
} else {
System.out.print("Dr. Chaz will have "+ difference +" pieces of chicken left over!");
}
}

}

}