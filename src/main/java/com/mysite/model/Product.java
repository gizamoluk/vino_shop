package com.mysite.model;

import javax.persistence.*;


@Entity
@Table( name = "product")
public class Product {
    public Product() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (name = "name")
    private String name;

    @Column ( name = "sugar_content")
    private String sugarContent;

    @Column (name = "country")
    private String country;

    @Column (name = "price")
    private int price;

    @Column(name="strong")
    private double strong;

    @Column (name="color")
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Column (name = "img")
    private String img;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSugarContent() {
        return sugarContent;
    }

    public void setSugarContent(String sugarContent) {
        this.sugarContent = sugarContent;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getStrong() {
        return strong;
    }

    public void setStrong(double strong) {
        this.strong = strong;
    }

}
