package com.example.testthi;

public class Product {
    String id;
    String name;
    String picture;
    Double price;

    public Product(String id, String name, String picture, Double price) {
        this.id = id;
        this.name = name;
        this.picture = picture;
        this.price = price;
    }

    public Product() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
