//package africa.semicolon.ChapterThree;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class InvoiceClassTest {
//
//    @BeforeEach
//    void setUp() {
//        System.out.println("Started Here");
//    }
//
//    @AfterEach
//    void tearDown() {
//        System.out.println("Ended Here");
//    }
//
//    @Test
//    void testThatInvoiceAmountIsProperlyCalculated() {
//        InvoiceClass ic = new InvoiceClass(10.0, 5);
//        double invoiceAmount = ic.getInvoiceAmount();
//        assertEquals(50.0, invoiceAmount);
//
//        ic.setPricePerItem(500.0);
//        ic.setQuantity(2);
//        invoiceAmount = ic.getInvoiceAmount();
//        assertEquals(1000.0, invoiceAmount);
//    }
//
//    @Test
//    void checkThatQuantityIsSetToZeroIfItIsNotPositive() {
//        InvoiceClass ic = new InvoiceClass(10.0, -5);
//        int quantity = ic.getQuantity();
//        assertEquals(0, quantity);
//
//        ic.setQuantity(-100);
//        quantity = ic.getQuantity();
//        assertEquals(0, quantity);
//    }
//}
