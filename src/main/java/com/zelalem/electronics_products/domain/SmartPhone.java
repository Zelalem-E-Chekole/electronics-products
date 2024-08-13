package com.zelalem.electronics_products.domain;

import java.time.LocalDate;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("SmartPhone") // This value will be used in the 'product_type' column
public class SmartPhone extends Product {

    private String operatingSystem; // Operating system (e.g., Android, iOS)
    private int ram; // RAM size in GB
    private int storage; // Internal storage size in GB
    private double cameraResolution; // Camera resolution in MP
    private String color; // Color of the smartphone

    // Default constructor (required by JPA)
    protected SmartPhone() {
        super(); // Calls the default constructor of the Product class
    }

    // Parameterized constructor
    public SmartPhone(String name, double productionCost, Double salePrice, String description,
                      String brand, Category category, double weight, LocalDate releaseDate,
                      double rating, String operatingSystem, int ram, int storage, double cameraResolution, String color) {
        super(name, productionCost, salePrice, description, brand, category, weight, releaseDate, rating);
        this.operatingSystem = operatingSystem;
        this.ram = ram;
        this.storage = storage;
        this.cameraResolution = cameraResolution;
        this.color = color;
    }

    // Getters and Setters
    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(double cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
