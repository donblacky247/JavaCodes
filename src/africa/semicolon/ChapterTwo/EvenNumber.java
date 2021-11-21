package africa.semicolon.ChapterTwo;

import java.util.Scanner;

public class EvenNumber {

      public static void main(String[] args) {
//        // create numbers from 1 to 100
//        // check if number divided by 2 return a zero
//        // if number returns a zero print number
//
////        int number = 1;
////        while (number <= 100){
////            if (number % 2 == 0)
////                System.out.print(number+ " ");
////            number = number + 1;
////        }
//
//        for(int number = 1; number <= 100; number=number+1){
//            if (number % 2 == 0)
//            System.out.print(number+ " ");
//           // number = number + 1;
//
////        }
//          int total = 0;
//          int score = 0;
//
//          do {
//             // total = total + score;
//              System.out.println("Enter a score");
//              Scanner scanner = new Scanner(System.in);
//              score = scanner.nextInt();
//              total = total + score;
//          }
//         // while (score !=-50);
//          while (score >= 0 && score < 101);
//          System.out.println("Total is " + total);


          int total = 0;
          int score = 0;

          while (score >= 0 && score < 101) ;
          total = total + score;
          System.out.println("Enter a score");
          Scanner scanner = new Scanner(System.in);
          score = scanner.nextInt();

      }
}
