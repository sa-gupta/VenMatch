package com.venMatch.service.impl;

import com.venMatch.dao.impl.CustomerDaoImpl;
import com.venMatch.dao.interfaces.CustomerDao;
import com.venMatch.service.interfaces.CustomerService;
import com.venMatch.util.VenMatchUtility;

public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao;

    public CustomerServiceImpl() {
        this.customerDao = new CustomerDaoImpl();
    }

    @Override
    public void createCustomer(VenMatchUtility venMatchUtility, String path) {
        customerDao.createCustomer(venMatchUtility, path);
    }
}
