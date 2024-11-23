package com.venMatch.dto;

public class VenueDto {

    private String name;
    private Integer totalCost;
    private Integer totalRoomRequire;

    public VenueDto() {
    }

    public VenueDto(String name, Integer totalCost, Integer totalRoomRequire) {
        this.name = name;
        this.totalCost = totalCost;
        this.totalRoomRequire = totalRoomRequire;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Integer totalCost) {
        this.totalCost = totalCost;
    }

    public Integer getTotalRoomRequire() {
        return totalRoomRequire;
    }

    public void setTotalRoomRequire(Integer totalRoomRequire) {
        this.totalRoomRequire = totalRoomRequire;
    }

    @Override
    public String toString() {
        return "VenueDto{" +
                "name='" + name + '\'' +
                ", totalCost=" + totalCost +
                ", totalRoomRequire=" + totalRoomRequire +
                '}';
    }
}
