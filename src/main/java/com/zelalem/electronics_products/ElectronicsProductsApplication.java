package com.zelalem.electronics_products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.zelalem.electronics_products.domain.Category;
import com.zelalem.electronics_products.domain.Laptop;
import com.zelalem.electronics_products.domain.Product;
import com.zelalem.electronics_products.domain.Refrigerator;
import com.zelalem.electronics_products.domain.SmartPhone;
import com.zelalem.electronics_products.domain.TV;
import com.zelalem.electronics_products.service.CategoryService;
import com.zelalem.electronics_products.service.ProductService;

import java.time.LocalDate;

@SpringBootApplication
public class ElectronicsProductsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElectronicsProductsApplication.class, args);
    }

    @Bean
    public CommandLineRunner initDatabase(CategoryService categoryService, ProductService productService) {
        return args -> {
            // Create categories
            Category tvsCategory = new Category("TVs", "Television appliances");
            Category refrigeratorsCategory = new Category("Refrigerators", "Cooling appliances");
            Category smartphonesCategory = new Category("Smartphones", "Mobile smart devices");
            Category laptopsCategory = new Category("Laptops", "Variety of laptops");

            categoryService.createCategory(tvsCategory);
            categoryService.createCategory(refrigeratorsCategory);
            categoryService.createCategory(smartphonesCategory);
            categoryService.createCategory(laptopsCategory);

            // Adding TVs
            productService.createProduct(new TV("Samsung QLED 55\"", 800.00, 700.00, 
                "55-inch QLED smart TV with stunning picture quality.", "Samsung", tvsCategory, 
                15.0, LocalDate.of(2022, 11, 15), 4.7, 55, "4K", "QLED", true));
            
            productService.createProduct(new TV("LG OLED 65\"", 1200.00, 1100.00, 
                "65-inch OLED TV with perfect black levels.", "LG", tvsCategory, 
                16.0, LocalDate.of(2021, 9, 20), 4.8, 65, "4K", "OLED", true));
            
            productService.createProduct(new TV("Sony Bravia 50\"", 700.00, 650.00, 
                "50-inch Full HD TV with vibrant colors.", "Sony", tvsCategory, 
                12.0, LocalDate.of(2022, 3, 10), 4.6, 50, "Full HD", "LED", true));
            
            productService.createProduct(new TV("TCL 40\"", 300.00, 250.00, 
                "40-inch LED TV perfect for any room.", "TCL", tvsCategory, 
                8.0, LocalDate.of(2023, 8, 1), 4.2, 40, "HD", "LED", false));
            
            productService.createProduct(new TV("Sharp Aquos 70\"", 1500.00, 1400.00, 
                "70-inch Ultra HD TV with great sound quality.", "Sharp", tvsCategory, 
                20.0, LocalDate.of(2021, 5, 5), 4.7, 70, "4K", "LED", true));

            // Adding Refrigerators
            productService.createProduct(new Refrigerator("LG French Door Refrigerator", 2200.00, 2000.00, 
                "4-door refrigerator with smart features and sleek design.", "LG", refrigeratorsCategory, 
                100.0, LocalDate.of(2020, 10, 10), 4.6, 680, "A++", true, "Stainless Steel"));
            
            productService.createProduct(new Refrigerator("Whirlpool Side by Side Refrigerator", 1800.00, 1600.00, 
                "Side by side refrigerator with ice and water dispenser.", "Whirlpool", refrigeratorsCategory, 
                90.0, LocalDate.of(2022, 1, 15), 4.5, 500, "A+", true, "Black"));
            
            productService.createProduct(new Refrigerator("Samsung Top Freezer Refrigerator", 1500.00, 1300.00, 
                "Classic top-freezer refrigerator with efficient cooling.", "Samsung", refrigeratorsCategory, 
                85.0, LocalDate.of(2021, 8, 1), 4.3, 450, "A++", true, "White"));
            
            productService.createProduct(new Refrigerator("Frigidaire Compact Refrigerator", 250.00, 200.00, 
                "Compact refrigerator, ideal for small spaces.", "Frigidaire", refrigeratorsCategory, 
                30.0, LocalDate.of(2023, 6, 1), 4.0, 100, "A", false, "Silver"));
            
            productService.createProduct(new Refrigerator("Bosch Built-in Refrigerator", 2500.00, 2300.00, 
                "Built-in refrigerator with customizable panels.", "Bosch", refrigeratorsCategory, 
                95.0, LocalDate.of(2021, 12, 12), 4.8, 600, "A+++", true, "Custom Panel"));

            // Adding Smartphones
            productService.createProduct(new SmartPhone("iPhone 14 Pro", 1000.00, 950.00, 
                "Latest iPhone with advanced camera features.", "Apple", smartphonesCategory, 
                0.2, LocalDate.of(2022, 9, 16), 4.9, "iOS", 6, 256, 12.0, "Space Gray"));
            
            productService.createProduct(new SmartPhone("Samsung Galaxy S22", 850.00, 800.00, 
                "High-performance smartphone with dynamic AMOLED display.", "Samsung", smartphonesCategory, 
                0.175, LocalDate.of(2022, 2, 25), 4.8, "Android", 8, 128, 50.0, "Phantom Black"));
            
            productService.createProduct(new SmartPhone("Google Pixel 6", 600.00, 550.00, 
                "Premium smartphone with amazing camera capabilities.", "Google", smartphonesCategory, 
                0.207, LocalDate.of(2021, 10, 28), 4.7, "Android", 8, 256, 50.0, "Sorta Seafoam"));
            
            productService.createProduct(new SmartPhone("OnePlus 9", 700.00, 650.00, 
                "Powerful smartphone with a fluid AMOLED display.", "OnePlus", smartphonesCategory, 
                0.192, LocalDate.of(2021, 3, 23), 4.5, "Android", 12, 256, 48.0, "Morning Mist"));
            
            productService.createProduct(new SmartPhone("Xiaomi Mi 11", 750.00, 700.00, 
                "Stunning display and great performance at an affordable price.", "Xiaomi", smartphonesCategory, 
                0.196, LocalDate.of(2021, 1, 1), 4.6, "Android", 8, 128, 108.0, "Horizon Blue"));
            
         // Adding Laptops

            productService.createProduct(new Laptop("Dell XPS 13", 800.00, 750.00, 
                "Thin and lightweight laptop with stunning 4K display.", "Dell", laptopsCategory, 
                1.2, LocalDate.of(2022, 3, 1), 4.8, "Intel Core i5", 8, "Intel Iris Xe", 
                "SSD", 256));

            productService.createProduct(new Laptop("HP Envy 15", 1000.00, 950.00, 
                "Powerful laptop with vibrant colors and great sound.", "HP", laptopsCategory, 
                2.0, LocalDate.of(2022, 6, 15), 4.7, "Intel Core i7", 16, "NVIDIA GeForce MX250", 
                "SSD", 512));

            productService.createProduct(new Laptop("Lenovo ThinkPad X1 Carbon", 
                1200.00, 1100.00, "Business-focused laptop with long battery life and durable design.", 
                "Lenovo", laptopsCategory, 
                1.4, LocalDate.of(2022, 1, 20), 
                4.9, "Intel Core i5", 8, "Intel UHD Graphics", 
                "SSD", 512));

           
    };
}
}