package com.zelalem.electronics_products.domain;

import java.time.LocalDate;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Laptop") // This value will be used in the 'product_type' column
public class Laptop extends Product {

    private String processor; // Type of processor
    private int ram;          // RAM size in GB
    private String gpu;       // GPU type
    private String storageType; // Storage type (e.g., SSD)
    private int storageSize;  // Storage size in GB

    // Default constructor (required by JPA)
    protected Laptop() {
        super(); // Calls the default constructor of the Product class
    }

    // Parameterized constructor
    public Laptop(String name, double productionCost, Double salePrice, String description,
                  String brand, Category category, double weight, LocalDate releaseDate,
                  double rating, String processor, int ram, String gpu, 
                  String storageType, int storageSize) {
        super(name, productionCost, salePrice, description, brand, category, weight, releaseDate, rating);
        this.processor = processor;
        this.ram = ram;
        this.gpu = gpu;
        this.storageType = storageType;
        this.storageSize = storageSize;
    }
	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getGpu() {
		return gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	public String getStorageType() {
		return storageType;
	}

	public void setStorageType(String storageType) {
		this.storageType = storageType;
	}

	public int getStorageSize() {
		return storageSize;
	}

	public void setStorageSize(int storageSize) {
		this.storageSize = storageSize;
	}
    
    }