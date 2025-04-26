/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Order {
    private Customer customer;
    private Artwork artwork;
    private boolean isApproved;
    
    public Order(Customer customer, Artwork artwork) {
        this.customer = customer;
        this.artwork = artwork;
        this.isApproved = false;
    }
    
    public boolean placeOrder() {
        if (artwork.isAvailable()) {
            artwork.markAsSold();
            return true;
        }
        
        return false;
    }
    
    public void approveOrder() {
        isApproved = true;
    }
    
    public boolean isApproved() {
        return isApproved;
    }
    
    public Customer getCustomer() {
        return customer;
    }
    
    public Artwork getArtwork() {
        return artwork;
    }
}


