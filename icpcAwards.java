import java.util.*;
public class icpcAwards {
    public static void main(String[] args) {
        ArrayList <String> schools = new ArrayList<String>();
        ArrayList <String> teams = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        int teamNumber = scan.nextInt();

        for (int i = 0; i < teamNumber; i++) {
            String temp = scan.next();
            if (schools.contains(temp) == false) {
                schools.add(temp);
                temp = scan.next();
                teams.add(temp);
            } else {
                temp = scan.next();
            }
        }

        for (int i = 0; i < 12; i++) {
            System.out.println(schools.get(i) + " "
            + teams.get(i));
        }

        scan.close();
    }
}