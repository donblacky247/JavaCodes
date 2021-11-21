package africa.semicolon.ChapterThree;

import java.util.Scanner;

public class TestDriller {

    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter How Many Copies You Want To Buy: ");
        x = input.nextInt();
        if(x >= 1 && x <= 4 ){
            System.out.println(2000 * x + " Is Your Price Bill. Thanks!!! ");
        }else{
            if (x >= 5 && x <= 9){
                System.out.println(1800 * x + " Is Your Price Bill. Thanks!!! ");
            }else {
                if (x >= 10 && x <= 29){
                    System.out.println(1600 * x + " Is Your Price Bill. Thanks!!! ");
                }else {
                    if (x >= 30 && x <= 49){
                        System.out.println(1500 * x + " Is Your Price Bill. Thanks!!! ");
                    }else {
                        if (x >= 50 && x <= 99){
                            System.out.println(1200 * x + " Is Your Price Bill. Thanks!!! ");
                        }else {
                            if (x >= 100 && x <= 199){
                                System.out.println(1200 * x + " Is Your Price Bill. Thanks!!! ");
                            }else {
                                if (x >= 200 && x <= 499 ){
                                    System.out.println(1100 * x + " Is Your Price Bill. Thanks!!! ");
                                }else {
                                    if (x >= 500){
                                        System.out.println(1000 * x + " Is Your Price Bill. Thanks!!! ");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}
