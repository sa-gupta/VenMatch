package com.venMatch.model;

import java.time.LocalDateTime;

public class Customer {
    private static int idCounter = 1; // Static counter for id auto-increment
    private Integer id;
    private String name;
    private LocalDateTime expextedDateOfPurchase;
    private Integer forNoOfDays;
    private Integer minNoOfGuests;
    private Integer maxNoOfGuests;

    public Customer(String name, LocalDateTime expextedDateOfPurchase, Integer forNoOfDays, Integer minNoOfGuests, Integer maxNoOfGuests) {
        this.id = idCounter++;
        this.name = name;
        this.expextedDateOfPurchase = expextedDateOfPurchase;
        this.forNoOfDays = forNoOfDays;
        this.minNoOfGuests = minNoOfGuests;
        this.maxNoOfGuests = maxNoOfGuests;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getExpextedDateOfPurchase() {
        return expextedDateOfPurchase;
    }

    public void setExpextedDateOfPurchase(LocalDateTime expextedDateOfPurchase) {
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
        return "Venue{" +
                "name='" + name + '\'' +
                ", expextedDateOfPurchase=" + expextedDateOfPurchase +
                ", forNoOfDays=" + forNoOfDays +
                ", minNoOfGuests=" + minNoOfGuests +
                ", maxNoOfGuests=" + maxNoOfGuests +
                '}';
    }
}
