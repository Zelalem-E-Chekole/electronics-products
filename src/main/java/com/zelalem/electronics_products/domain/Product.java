package com.zelalem.electronics_products.domain;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.InheritanceType;

@Entity
@Table(name = "products")
@Inheritance(strategy = InheritanceType.JOINED) // Use JOINED for joined table inheritance
@DiscriminatorColumn(name = "product_type") // This will differentiate subclasses of Product
public abstract class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false) 
    private String name;

    @Column(name = "production_cost", nullable = false)
    private double productionCost;

    @Column(name = "sale_price")
    private Double price;

    private String description;

    private String brand;

    @ManyToOne // Assuming many products can belong to one category
    @JoinColumn(name = "category_id")
    private Category category;

    private double weight;
    
    @Column(name = "release_date")
    private LocalDate releaseDate;

    private double rating;

    @Column(name = "date_added", nullable = false)
    private LocalDate dateAdded;

    // Default constructor needed by JPA
    protected Product() {
        this.dateAdded = LocalDate.now(); // Defaults to the current date on creation
    }

    // Parameterized constructor
    public Product(String name, double productionCost, Double price, String description,
                   String brand, Category category, double weight, LocalDate releaseDate, double rating) {
        this.name = name;
        this.productionCost = productionCost;
        this.price = price;
        this.description = description;
        this.brand = brand;
        this.category = category;
        this.weight = weight;
        this.releaseDate = releaseDate;
        this.rating = rating;
        this.dateAdded = LocalDate.now(); // Set dateAdded to current date
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getProductionCost() {
		return productionCost;
	}

	public void setProductionCost(double productionCost) {
		this.productionCost = productionCost;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public LocalDate getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(LocalDate dateAdded) {
		this.dateAdded = dateAdded;
	}

	

}