package africa.semicolon.ChapterFive;

public class ChristmasSong {

    public static void main(String[] args) {
        int day = 1;
        String dayInWord = "";

        while (day <= 12){
            switch (day){
                case 1: dayInWord = "First";
                break;
                case 2: dayInWord = "Second";
                break;
                case 3: dayInWord = "Third";
                    break;
                case 4: dayInWord = "Fourth";
                    break;
                case 5: dayInWord = "Fifth";
                    break;
                case 6: dayInWord = "Sixth";
                    break;
                case 7: dayInWord = "Seventh";
                    break;
                case 8: dayInWord = "Eight";
                    break;
                case 9: dayInWord = "Ninth";
                    break;
                case 10: dayInWord = "Tenth";
                    break;
                case 11: dayInWord = "Eleventh";
                    break;
                case 12: dayInWord = "Twelfth";
                    break;
            }

            System.out.printf("On the %s day of Christmas my true love gave to me%n", dayInWord);

            switch (day){
                case 12:
                    System.out.println("Twelve drummers drumming");
                case 11:
                    System.out.println("Eleven pipers piping");
                case 10:
                    System.out.println("Ten lords a leaping");
                case 9:
                    System.out.println("Nine ladies dancing");
                case 8:
                    System.out.println("Eight maids a milking");
                case 7:
                    System.out.println("Seven swans a swimming");
                case 6:
                    System.out.println("Six geese a laying");
                case 5:
                    System.out.println("Five gold rings");
                case 4:
                    System.out.println("Four calling birds");
                case 3:
                    System.out.println("Three French hens");
                case 2:
                    System.out.println("Two turtle doves and");
                case 1:
                    System.out.println("A partridge in a pear tree");
            }
            System.out.println();
            day = day + 1;
        }
    }

}
