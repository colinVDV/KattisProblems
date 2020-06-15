import java.util.*;

public class avion {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int passengers = 5;
      boolean fbi = true;
   
      for (int i = 0; i < passengers; i++) {
         String agent = scan.next();
         if(agent.contains("FBI")){
            fbi = false;
            System.out.print( i + 1 + " ");
         }
      }
   
      if (fbi) {
         System.out.print("HE GOT AWAY!");
      }
   
   }
}