import java.util.*;
public class datum {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int y = scan.nextInt();
      int x = scan.nextInt();
      String[] days = {"Thursday","Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};
      int[] months = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334}; 
      int total = months[x-1] + y;
      int count = 0;
      for (int i = 0; i < total - 1; i++){
         count = count + 1;
         if (count == 7){
            count = 0;
         }
      }
      System.out.print(days[count]);
   }

}