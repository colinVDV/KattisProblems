import java.util.*;
public class jobExpenses {
   public static void main (String[] args) {
      Scanner scan = new Scanner(System.in);
      int times = scan.nextInt();
      int total = 0;
   
      for (int i = 0; i < times; i++){
         int x = scan.nextInt();
         if (x < 0){
            total = total + Math.abs(x);
         }
      }
      System.out.print(total);
   
   }

}