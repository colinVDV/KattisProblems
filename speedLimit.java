import java.util.*;

public class speedLimit {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int trips = 1;
while(trips > 0) {
trips = scan.nextInt();
int count = 0;
int distance = 0;
for (int i = 0; i < trips; i++) {
int speed = scan.nextInt();
int hours = scan.nextInt();
distance = distance + speed * (hours - count);
count = hours;
}
if(distance!=0)
System.out.println(distance + " miles");
}


}

}
