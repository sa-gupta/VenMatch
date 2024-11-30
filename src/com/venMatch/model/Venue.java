package com.venMatch.model;

public class Venue {
    private static int idCounter = 1;
    private Integer id;
    private String name;
    private String city;
    private Integer costPerRoom;
    private Integer noOfRooms;

    public Venue() {
        this.id = idCounter++;
    }

    public Venue(String name, String city, Integer costPerRoom, Integer noOfRooms) {
        this.name = name;
        this.city = city;
        this.costPerRoom = costPerRoom;
        this.noOfRooms = noOfRooms;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getCostPerRoom() {
        return costPerRoom;
    }

    public void setCostPerRoom(Integer costPerRoom) {
        this.costPerRoom = costPerRoom;
    }

    public Integer getNoOfRooms() {
        return noOfRooms;
    }

    public void setNoOfRooms(Integer noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    @Override
    public String toString() {
        return "Venue{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", costPerRoom=" + costPerRoom +
                ", noOfRooms=" + noOfRooms +
                '}';
    }
}
