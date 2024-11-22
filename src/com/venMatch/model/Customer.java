package com.venMatch.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Customer {
    private static int idCounter = 1; // Static counter for id auto-increment
    private Integer id;
    private String name;
    private String expextedDateOfPurchase;
    private Integer forNoOfDays;
    private Integer minNoOfGuests;
    private Integer maxNoOfGuests;

    public Customer() {}

    public Customer(String name, String expextedDateOfPurchase, Integer forNoOfDays, Integer minNoOfGuests, Integer maxNoOfGuests) {
        this.id = idCounter++;
        this.name = name;
        this.expextedDateOfPurchase = expextedDateOfPurchase;
        this.forNoOfDays = forNoOfDays;
        this.minNoOfGuests = minNoOfGuests;
        this.maxNoOfGuests = maxNoOfGuests;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Customer.idCounter = idCounter;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpextedDateOfPurchase() {
        return expextedDateOfPurchase;
    }

    public void setExpextedDateOfPurchase(String expextedDateOfPurchase) {
        this.expextedDateOfPurchase = expextedDateOfPurchase;
    }

    public Integer getForNoOfDays() {
        return forNoOfDays;
    }

    public void setForNoOfDays(Integer forNoOfDays) {
        this.forNoOfDays = forNoOfDays;
    }

    public Integer getMinNoOfGuests() {
        return minNoOfGuests;
    }

    public void setMinNoOfGuests(Integer minNoOfGuests) {
        this.minNoOfGuests = minNoOfGuests;
    }

    public Integer getMaxNoOfGuests() {
        return maxNoOfGuests;
    }

    public void setMaxNoOfGuests(Integer maxNoOfGuests) {
        this.maxNoOfGuests = maxNoOfGuests;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", expextedDateOfPurchase=" + expextedDateOfPurchase +
                ", forNoOfDays=" + forNoOfDays +
                ", minNoOfGuests=" + minNoOfGuests +
                ", maxNoOfGuests=" + maxNoOfGuests +
                '}';
    }
}
