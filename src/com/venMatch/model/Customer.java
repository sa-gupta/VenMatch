package com.venMatch.model;

public class Customer {
    private static int idCounter = 1;
    private Integer id;
    private String name;
    private String expextedDateOfPurchase;
    private Integer forNoOfDays;
    private Integer minNoOfGuests;
    private Integer maxNoOfGuests;

    public Customer() {
        this.id = idCounter++;
    }

    public Customer(String name, String expextedDateOfPurchase, Integer forNoOfDays, Integer minNoOfGuests, Integer maxNoOfGuests) {
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

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", expextedDateOfPurchase='" + expextedDateOfPurchase + '\'' +
                ", forNoOfDays=" + forNoOfDays +
                ", minNoOfGuests=" + minNoOfGuests +
                ", maxNoOfGuests=" + maxNoOfGuests +
                '}';
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

}
