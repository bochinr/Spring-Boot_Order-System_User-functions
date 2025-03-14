
package com.example.demo1.Entity;

import lombok.Data;

@Data
public class food {
    private int id;
    private String name;
    private String description;
    private double price;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrize() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
