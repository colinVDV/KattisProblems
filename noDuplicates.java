import java.util.*;
public class noDuplicates{

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String line = scan.nextLine();
      Scanner scanno = new Scanner(line);
      boolean check = false;
      ArrayList <String>list = new ArrayList <String>();
      while (scanno.hasNext()) {
         String sub = scanno.next();
         if (!list.contains(sub)) {
            list.add(sub);
         } else {
            check = true;
         }
      }
   if (check) {
   System.out.print("no");
   } else {
   System.out.print("yes");
   }
   
   }
}