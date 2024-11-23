package com.venMatch.service.impl;

import com.venMatch.dao.impl.CustomerDaoImpl;
import com.venMatch.dao.impl.VenueDaoImpl;
import com.venMatch.dao.interfaces.CustomerDao;
import com.venMatch.dao.interfaces.VenueDao;
import com.venMatch.dto.OutputDto;
import com.venMatch.dto.VenueDto;
import com.venMatch.model.Customer;
import com.venMatch.model.Venue;
import com.venMatch.service.interfaces.CustomerService;
import com.venMatch.util.VenMatchUtility;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao;
    private VenueDao venueDao;

    public CustomerServiceImpl() {
        this.customerDao = new CustomerDaoImpl();
        this.venueDao = new VenueDaoImpl();
    }

    @Override
    public void createCustomer(VenMatchUtility venMatchUtility, String path) throws Exception {
        customerDao.createCustomer(venMatchUtility, path);
    }

    @Override
    public void printCustomer(int i) {
        customerDao.print(i);
    }

    @Override
    public void matchCustomerWithVenue() {
        List<Customer> customers = customerDao.getALlCustomers();
        List<Venue> venues = venueDao.getAllVenues();
        List<OutputDto> outputDtos = new ArrayList<>();

        for (Customer customer : customers) {
            List<VenueDto> suitableVenueForThreeOccupancy = new ArrayList<>();
            List<VenueDto> suitableVenueForFourOccupancy = new ArrayList<>();
            Integer approxGuest = customer.getMinNoOfGuests() == 0 ? customer.getMaxNoOfGuests() : ((customer.getMaxNoOfGuests() + customer.getMinNoOfGuests())/2);
            OutputDto o = new OutputDto();
            o.setCustName(customer.getName());
            for (Venue venue : venues) {
                if((venue.getNoOfRooms()*3) > approxGuest){
                    suitableVenueForThreeOccupancy.add(new VenueDto(venue.getName(), (approxGuest/3)*venue.getCostPerRoom(),approxGuest/3));
                }

                if((venue.getNoOfRooms()*4) > approxGuest){
                    suitableVenueForFourOccupancy.add(new VenueDto(venue.getName(), (approxGuest/4)*venue.getCostPerRoom(),approxGuest/4));
                }
            }

            o.setVenueForThreeOccupancy(suitableVenueForThreeOccupancy);
            o.setVenueForFourOccupancy(suitableVenueForFourOccupancy);
            outputDtos.add(o);
        }

        try {
            VenMatchUtility.writeCsv("output.csv", outputDtos);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
