package com.venMatch.dao.interfaces;

import com.venMatch.model.Customer;
import com.venMatch.util.VenMatchUtility;

import java.util.List;

public interface CustomerDao {
    void createCustomer(VenMatchUtility venMatchUtility, String path) throws Exception;

    void print(int i);

    List<Customer> getALlCustomers();
}
