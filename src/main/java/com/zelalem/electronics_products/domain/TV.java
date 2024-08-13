package com.zelalem.electronics_products.domain;

import java.time.LocalDate;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("TV") // This value will be used in the 'product_type' column
public class TV extends Product {

    private double screenSize; // Screen size in inches
    private String resolution; // Resolution (e.g., 4K, 1080p)
    private String type; // Type (e.g., LED, OLED, QLED, etc.)
    private boolean smartTV; // Whether it's a smart TV

    // Default constructor (required by JPA)
    protected TV() {
        super(); // Calls the default constructor of the Product class
    }

    // Parameterized constructor
    public TV(String name, double productionCost, Double salePrice, String description,
              String brand, Category category, double weight, LocalDate releaseDate,
              double rating, double screenSize, String resolution, String type, boolean smartTV) {
        super(name, productionCost, salePrice, description, brand, category, weight, releaseDate, rating);
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.type = type;
        this.smartTV = smartTV;
    }

    // Getters and Setters
    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isSmartTV() {
        return smartTV;
    }

    public void setSmartTV(boolean smartTV) {
        this.smartTV = smartTV;
    }
}
