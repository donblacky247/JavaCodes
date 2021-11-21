package africa.semicolon.ChapterThree;

public class InvoiceTest {

    public static void main(String[] args) {

        Invoice inv = new Invoice("i-Phone 6", "i-Phone 13 part for tha Phone", 3, 50000.25);

        System.out.printf("%nTotal Price for %d %s is %.2f%n%n", inv.getQuantity(), inv.getPartNumber(), inv.getInvoiceAmount());

        inv.setQuantity(-3);

        System.out.printf("Total Price for %d %s is %.2f%n%n", inv.getQuantity(), inv.getPartNumber(), inv.getInvoiceAmount());


    }
}
