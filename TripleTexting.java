// Julia enjoys talking to her grandma, playing with legos, 
// and inventing two-player card games where she has a winning strategy. 
// Recently however, she has not been able to talk to her grandma in person because of some kind of “pandemonium”. 
// Instead, they have resorted to texting, which is a very slow process since grandma types very slowly and often mistypes letters. 
// To make matters worse, grandma has started to write every word three times so that Julia can correct her mistypes. 
// For example, if grandma wants to write the word “hello”, she will instead write “hellohellohello”. 
// If she mistypes one of those letters, it might instead be sent as “hellohrllohello’.’

// Your task is to write a program that given a message sent by grandma, where possibly one letter has been changed to some other letter, finds the original word.

// Input
// The input consists of one string s containing lower case English letters (3≤|s|≤99). 
// This is the message sent by grandma. It is guaranteed that this string is the result of a word being written three times, where possibly one letter was changed to some other letter.

// Output
// Output one string t, the original word.

// Sample Input 1: hellohrllohello
//Sample Output 1: hello

// Sample Input 2: hejhejhej
//Sample Output 2: hej



import java.util.*;
public class TripleTexting {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String message = "";
        message = scan.next();
        scan.close();
        char[] ch = message.toCharArray();
        
        String solution = "";
        String solution2 = "";
        String  solution3 = "";

        //creating 3 separate possible solutions (at least 2 are correct)
        for (int i = 0; i < ch.length /3; i++) {
            solution = solution + ch[i];
        }

        for (int i =  ch.length /3; i < 2*(ch.length/3); i++) {
            solution2 = solution2 + ch[i];
        }

        for (int i = 2*(ch.length/3); i < ch.length; i++) {
            solution3 = solution3 + ch[i];
        }


        //comparing the 3 solutions to see if one is wrong, then print out the correct one
        if (solution.equals(solution2)) {
            System.out.print(solution);
        } else if(solution.equals(solution3)) {
            System.out.print(solution);
        } else {
            System.out.print(solution2);
        }
    }

}