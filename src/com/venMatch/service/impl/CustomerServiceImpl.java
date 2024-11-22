package com.venMatch.service.impl;

import com.venMatch.dao.impl.CustomerDaoImpl;
import com.venMatch.dao.impl.VenueDaoImpl;
import com.venMatch.dao.interfaces.CustomerDao;
import com.venMatch.dao.interfaces.VenueDao;
import com.venMatch.model.Customer;
import com.venMatch.model.Venue;
import com.venMatch.service.interfaces.CustomerService;
import com.venMatch.util.VenMatchUtility;

import java.util.List;

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


    }
}
