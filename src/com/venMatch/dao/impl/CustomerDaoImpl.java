package com.venMatch.dao.impl;

import com.venMatch.dao.interfaces.CustomerDao;
import com.venMatch.model.Customer;
import com.venMatch.util.VenMatchUtility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

    private List<Customer> customers = new ArrayList<>();

    @Override
    public void createCustomer(VenMatchUtility venMatchUtility, String path) throws Exception {
        this.customers = venMatchUtility.readFromCSV("/Users/sachingupta.vc/Downloads/custSheet.csv", Customer.class);
    }

    @Override
    public void print(int i) {
        int limit = Math.min(i, customers.size());

        for (int j = 0; j < limit; j++) {
            System.out.println(customers.get(j));
        }
    }

    @Override
    public List<Customer> getALlCustomers() {
        return customers;
    }
}
