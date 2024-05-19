package test;

import src.DeliveryInfo;
import java.util.Arrays;

public class DeliveryInfoTest {
    String[] districts = {"Ba Dinh", "Hoan Kiem", "Tay Ho", "Long Bien", "Cau Giay", "Dong Da", "Hai Ba Trung", "Hoang Mai", "Thanh Xuan"};
    private DeliveryInfo deliveryInfoUnderTest;
    private boolean expected, actual;

    public void setup() {
        deliveryInfoUnderTest = new DeliveryInfo();
    }
    public void testCheckAddressSupportRushOrder() {
        // Test 1
        deliveryInfoUnderTest.setDistrict("Thanh Xuan");
        deliveryInfoUnderTest.setCity("Hanoi");
        expected = true;
        actual = deliveryInfoUnderTest.checkAddressSupportRushOrder();
        assertCorrect(actual, expected);

        // Test 2
        deliveryInfoUnderTest.setDistrict("Ba Dinh");
        deliveryInfoUnderTest.setCity("Ho Chi Minh");
        expected = false;
        actual = deliveryInfoUnderTest.checkAddressSupportRushOrder();
        assertCorrect(actual, expected);

        // Test 3
        deliveryInfoUnderTest.setDistrict("");
        deliveryInfoUnderTest.setCity("Hanoi");
        expected = false;
        actual = deliveryInfoUnderTest.checkAddressSupportRushOrder();
        assertCorrect(actual, expected);
    }
    
    public void testCheckRushOrderInfo() {
        // Test 1
        deliveryInfoUnderTest.setDeliveryInstruction("Please deliver to the front door");
        deliveryInfoUnderTest.setDeliveryTime(10);
        deliveryInfoUnderTest.setCurrentTime(8);
        expected = true;
        actual = deliveryInfoUnderTest.checkRushOrderInfo();
        assertCorrect(actual, expected);

        // Test 2
        deliveryInfoUnderTest.setDeliveryInstruction(null);
        deliveryInfoUnderTest.setDeliveryTime(10);
        deliveryInfoUnderTest.setCurrentTime(5);
        expected = false;
        actual = deliveryInfoUnderTest.checkRushOrderInfo();
        assertCorrect(actual, expected);

        // Test 3
        deliveryInfoUnderTest.setDeliveryInstruction("Please deliver to the front door");
        deliveryInfoUnderTest.setDeliveryTime(10);
        deliveryInfoUnderTest.setCurrentTime(10);
        expected = false;
        actual = deliveryInfoUnderTest.checkRushOrderInfo();
        assertCorrect(actual, expected);
    }

    public void testCheckDeliveryInfo() {
        // Test 1
        deliveryInfoUnderTest.setCity("");
        expected = false; // city cannot be null
        boolean actual = deliveryInfoUnderTest.checkDeliveryInfo();
        assertCorrect(actual, expected);

        // Test 2
        deliveryInfoUnderTest.setCity("Hanoi");
        deliveryInfoUnderTest.setDistrict("");
        expected = false; // district cannot be null
        actual = deliveryInfoUnderTest.checkDeliveryInfo();
        assertCorrect(actual, expected);

        // Test 3
        deliveryInfoUnderTest.setDeliveryTime(25); // invalid value
        expected = false;
        actual = deliveryInfoUnderTest.checkDeliveryInfo();
        assertCorrect(actual, expected);

        // Test 4
        deliveryInfoUnderTest.setDeliveryTime(-100); // invalid value
        expected = false;
        actual = deliveryInfoUnderTest.checkDeliveryInfo();
        assertCorrect(actual, expected);
    }

    private void assertCorrect(boolean actual, boolean expected) {
        if (actual == expected) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }
}
