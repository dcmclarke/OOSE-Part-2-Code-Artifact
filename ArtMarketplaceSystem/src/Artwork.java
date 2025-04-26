/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Artwork {
    private String title;
    private String artist;
    private double price;
    private boolean isAvailable;
    
    public Artwork(String title, String artist, double price) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.isAvailable = true;
    }
    
    public void markAsSold() {
        this.isAvailable = false;
    }
    
    public boolean isAvailable() {
        return isAvailable;
    }
    
    public String getTitle() {
        return title;
    }
    
    public double getPrice() {
        return price;
    }
}
