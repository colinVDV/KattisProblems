import java.util.*;
public class licenseToLauch {
   public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   int debree = scan.nextInt();
   int[] array = new int[debree];
   
   for (int i = 0; i < debree; i++) {
   array[i] = scan.nextInt();
      }
      
      int lowest = array[array.length - 1];
      int result = array.length - 1;
      
      for (int i = 1; i < array.length ; i++) {
      if (array[i] > array[i-1] && array[i-1] < lowest) {
      lowest = array[i-1];
      result = i - 1;
      }
      }
             System.out.print(result);
   }

}