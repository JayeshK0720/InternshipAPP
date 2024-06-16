package com.jktech.edutransit_app;


public class book_ride_1_model {

    private int img;  // Image resource ID
    private String name;  // Name of the person or entity
    private String address;  // Address associated

    // Constructor with image, name, and address
    public book_ride_1_model(int img, String name, String address) {
        this.img = img;
        this.name = name;
        this.address = address;
    }

    // Constructor without image, only name and address
    public book_ride_1_model(String name, String address) {
        this(-1, name, address);  // Set img to -1 indicating no image is provided
    }

    // Getters for all fields
    public int getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}