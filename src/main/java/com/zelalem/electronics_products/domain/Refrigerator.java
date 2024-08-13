
package com.zelalem.electronics_products.domain;

import java.time.LocalDate;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Refrigerator") // This value will be used in the 'product_type' column
public class Refrigerator extends Product {

    private double capacity; // Capacity in liters
    private String energyRating; // Energy rating (e.g., A+, A++, etc.)
    private boolean hasFreezer; // Whether it has a freezer compartment
    private String color; // Color of the refrigerator

    // Default constructor (required by JPA)
    protected Refrigerator() {
        super(); // Calls the default constructor of the Product class
    }

    // Parameterized constructor
    public Refrigerator(String name, double productionCost, Double salePrice, String description,
                        String brand, Category category, double weight, LocalDate releaseDate,
                        double rating, double capacity, String energyRating, boolean hasFreezer, String color) {
        super(name, productionCost, salePrice, description, brand, category, weight, releaseDate, rating);
        this.capacity = capacity;
        this.energyRating = energyRating;
        this.hasFreezer = hasFreezer;
        this.color = color;
    }

    // Getters and Setters
    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getEnergyRating() {
        return energyRating;
    }

    public void setEnergyRating(String energyRating) {
        this.energyRating = energyRating;
    }

    public boolean isHasFreezer() {
        return hasFreezer;
    }

    public void setHasFreezer(boolean hasFreezer) {
        this.hasFreezer = hasFreezer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}