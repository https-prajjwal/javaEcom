package com.example.cartApplication;

public class CartItem {
    private String name;
    private double price;
    private String image;
    private int quantity;

    public CartItem(String name, double price, String image) {
        this.name = name;
        this.price = price;
        this.image= image;
        this.quantity= 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
