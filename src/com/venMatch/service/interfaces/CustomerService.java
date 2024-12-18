package com.venMatch.service.interfaces;

import com.venMatch.util.VenMatchUtility;

public interface CustomerService {
    void createCustomer(VenMatchUtility venMatchUtility, String path) throws Exception;

    void printCustomer(int i);

    void matchCustomerWithVenue();
}
