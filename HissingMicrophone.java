import java.util.*;
public class HissingMicrophone {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String s = scan.next();
      char p;
      boolean check = true;
   
      for (int i = 1; i < s.length(); i++) {
         p = s.charAt(i-1);
         char c = s.charAt(i);
         if (p == c && p == 's') {
            check = false;
         }
      }
      if (check) {
         System.out.print("no hiss");
      } else {
         System.out.print("hiss");
      }
   }
}