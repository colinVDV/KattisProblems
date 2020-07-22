import java.util.*;
public class diceGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int scoreEmma = 0;
        int scoreGunnar = 0;
        
        for (int i = 0; i < 4; i++) {
            scoreGunnar += scan.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            scoreEmma += scan.nextInt();
        }
        
        if (scoreEmma == scoreGunnar) {
            System.out.println("Tie");
        }
        else if (scoreEmma > scoreGunnar) {
            System.out.println("Emma");
        }
        else {
            System.out.println("Gunnar");
        }
        
        
        scan.close();
    }

}