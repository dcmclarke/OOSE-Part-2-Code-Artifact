/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class OrderTest {
    
    @Test
    public void testPlaceOrderWithAvailableArtwork() {
        Customer c = new Customer("Alice", "alice@email.com", "password123");
        Artwork a = new Artwork("Starry NIght", "Van Gogh", 5000.0);
        Order o = new Order(c,a);
        
        boolean orderPlaced = o.placeOrder();
        
        assertTrue(orderPlaced);
        assertFalse(a.isAvailable()); //should be sold
    }
    
    @Test
    public void testPlaceOrderWithUnavailableArtwork() {
        Customer c = new Customer("Bob", "bob@email.com", "pw435");
        Artwork a = new Artwork("Mona Lisa", "Da Vinci", 10000.0);
        a.markAsSold(); //simulate that it is sold already
        
        Order o = new Order(c, a);
        boolean orderPlaced = o.placeOrder();
        
        assertFalse(orderPlaced);
    }
    
    @Test
    public void testPaymentProcessing() {
        Customer c = new Customer("Tom", "tom@email.com", "932");
        PaymentSystem p = new PaymentSystem();
        boolean success = p.processPayment(c, 250.0);
        
        assertTrue(success); //always return true in this version
    }
    
    @Test
    public void testCustomerLoginSuccess() {
        Customer c = new Customer("Jane", "jane@email.com", "mqpql");
        assertTrue(c.logIn("jane@email.com", "mqpql"));
    }
    
    @Test
    public void testCustomerLoginFailure() {
        Customer c = new Customer("Jane", "jane@email.com", "mqpql");
        assertFalse(c.logIn("jane@email.com", "wrongpassword"));
    }
}
