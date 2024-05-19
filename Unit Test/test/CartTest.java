package test;

import src.Cart;
import src.Product;

public class CartTest {
    private Cart cartUnderTest;
    private boolean actual, expected;
    public void setup() {
        cartUnderTest = new Cart();
    }
    public void testCheckProductForRushOrder() {
        // Test 1
        cartUnderTest.addProduct("French Kiwi Juice", 1, "description", "LP", "FKJ", "Music");
        expected = false; // assume this product is not available for rush order
        actual = cartUnderTest.checkProductForRushOrder();
        assertCorrect(actual, expected);

        // Test 2
        cartUnderTest = null;
        cartUnderTest.addProduct("Good morning Vietnam", 1, "description", "DVD", "V.A", "Music");
        expected = true; // assume this product is available for rush order
        actual = cartUnderTest.checkProductForRushOrder();
        assertCorrect(actual, expected);
    }

    public void testProductIsAvailable() {
        Product product = new Product();
        product.setQuantity(0);
        cartUnderTest.addProduct("product", 5, "description", "category", "brand", "type");
        expected = false;
        actual = cartUnderTest.productIsAvailable();
        assertCorrect(actual, expected);
    }

    public void testEmpty() {
        cartUnderTest.empty();
        if (cartUnderTest == null) {
            System.out.println("Cart is correctly emptied.");   
        } else {
            System.out.println("Cart is not empty");
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
