package com.venMatch.dto;

import java.util.List;

public class OutputDto {
    private String custName;
    private List<VenueDto> venueForThreeOccupancy;
    private List<VenueDto> venueForFourOccupancy;

    public OutputDto() {
    }

    public OutputDto(String custName, List<VenueDto> venueForThreeOccupancy, List<VenueDto> venueForFourOccupancy) {
        this.custName = custName;
        this.venueForThreeOccupancy = venueForThreeOccupancy;
        this.venueForFourOccupancy = venueForFourOccupancy;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public List<VenueDto> getVenueForThreeOccupancy() {
        return venueForThreeOccupancy;
    }

    public void setVenueForThreeOccupancy(List<VenueDto> venueForThreeOccupancy) {
        this.venueForThreeOccupancy = venueForThreeOccupancy;
    }

    public List<VenueDto> getVenueForFourOccupancy() {
        return venueForFourOccupancy;
    }

    public void setVenueForFourOccupancy(List<VenueDto> venueForFourOccupancy) {
        this.venueForFourOccupancy = venueForFourOccupancy;
    }

    @Override
    public String toString() {
        return "OutputDto{" +
                "custName='" + custName + '\'' +
                ", venueForThreeOccupancy=" + venueForThreeOccupancy +
                ", venueForFourOccupancy=" + venueForFourOccupancy +
                '}';
    }
}
