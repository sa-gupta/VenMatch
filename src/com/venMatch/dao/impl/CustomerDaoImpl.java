package com.venMatch.dao.impl;

import com.venMatch.dao.interfaces.CustomerDao;
import com.venMatch.model.Customer;
import com.venMatch.util.VenMatchUtility;

import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

    private List<Customer> customers = new ArrayList<>();

    @Override
    public void createCustomer(VenMatchUtility venMatchUtility, String path) throws Exception {
        this.customers = venMatchUtility.readFromCSV(path, Customer.class);
    }
}
