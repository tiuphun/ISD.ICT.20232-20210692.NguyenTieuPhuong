package test;

import src.Product;

public class ProductTest {
    private Product productUnderTest;
    public void setup() {
        productUnderTest = new Product();
    }
    public void testCheckProductForRushOrder() {
        boolean actual, expected;
        // Test 1
        productUnderTest = new Product("French Kiwi Juice", 1, "description", "LP", "FKJ", "Music");
        expected = false; // assume this product is not available for rush order
        actual = cartUnderTest.checkProductForRushOrder();
        assertCorrect(actual, expected);

        // Test 2
        productUnderTest = new Product("Good morning Vietnam", 1, "description", "DVD", "V.A", "Music");
        expected = true; // assume this product is available for rush order
        actual = cartUnderTest.checkProductForRushOrder();
        assertCorrect(actual, expected);
    }
    
    public void testGetQuantity() {
        Product product = new Product();
        product.setQuantity(10);
        int expected = 10;
        int actual = productUnderTest.getQuantity(product);
        assertEquals(actual, expected);
    }

    private void assertEquals(int actual, int expected) {
        if (actual == expected) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

    private void assertCorrect(boolean actual, boolean expected) {
        if (actual == expected) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

}
