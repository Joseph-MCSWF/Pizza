package com.example.Pizza;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Pizza {

    private Long id;
    private String crust;
    private double price;
    private String size;
    private String toppings;
    private boolean hasCheese;

    public Pizza(){};
    public Pizza(Long id, String crust, double price, String size, String toppings, boolean hasCheese) {
        this.id = id;
        this.crust = crust;
        this.price = price;
        this.size = size;
        this.toppings = toppings;
        this.hasCheese = hasCheese;
    }

//    public Pizza(Pizza newPizza) {
//        this.id = newPizza.getId();
//        this.crust = newPizza.getCrust();
//        this.price = newPizza.getPrice();
//        this.size = newPizza.getSize();
//        this.toppings = newPizza.getToppings();
//        this.hasCheese = newPizza.isHasCheese();
//    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public boolean isHasCheese() {
        return hasCheese;
    }

    public void setHasCheese(boolean hasCheese) {
        this.hasCheese = hasCheese;
    }
}
