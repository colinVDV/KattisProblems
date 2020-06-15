import java.util.*;
public class basketBallOneOnOne {
   public static void main (String[] args) {
      Scanner scan = new Scanner(System.in);
      String game = scan.nextLine();
      int scoreA = 0;
      int scoreB = 0;
      
      for (int i = 0; i < game.length(); i++) {
         boolean check = false;
         if(i % 2 == 1){
            if (game.charAt(i) == 'A'){
               check = true;
            }
         }
         
         if (i % 2 == 0) {
         
            if (check = true) {
            String A = null;
              A = A + game.charAt(i);
               scoreA = scoreA + (Integer.parseInt(A));
            }
            if (check = false){
              String B = null;
              B = B + game.charAt(i);
               scoreB = scoreB + Integer.parseInt(B);               }
         }
      }
      if (scoreA < scoreB) {
         System.out.print("B");
      }
      else {
         System.out.print("A");
      }
   
   }
}
