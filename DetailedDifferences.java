import java.util.*;
public class DetailedDifferences {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int loops = scan.nextInt();
      
      for (int j = 0; j < loops; j++){
         String s1 = scan.next();
         String s2 = scan.next();
         System.out.println(s1);
         System.out.println(s2);
         for (int i = 0; i < s1.length(); i++){
            if (s1.charAt(i) == s2.charAt(i)) {
               System.out.print(".");
            }else {
               System.out.print("*");
            }
         }
         System.out.println("");
         System.out.println("");
      }
   }

}