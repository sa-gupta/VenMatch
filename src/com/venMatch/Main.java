package com.venMatch;

import com.venMatch.service.impl.CustomerServiceImpl;
import com.venMatch.service.impl.VenueServiceImpl;
import com.venMatch.service.interfaces.CustomerService;
import com.venMatch.service.interfaces.VenueService;
import com.venMatch.util.VenMatchUtility;

import java.util.Scanner;

public class Main {

    private CustomerService customerService;
    private VenueService venueService;
    private Scanner scanner;
    private VenMatchUtility venMatchUtility;

    public Main() {
        this.scanner = new Scanner(System.in);
        this.customerService = new CustomerServiceImpl();
        this.venueService = new VenueServiceImpl();
        this.venMatchUtility = new VenMatchUtility();
    }

    void executeApp() {
        customerService.createCustomer(venMatchUtility,
                readFromConsole("Enter CSV path for customer creation"));

        venueService.createVenue(venMatchUtility,
                readFromConsole("Enter CSV path for venue creation"));

    }

    private String readFromConsole(String textToPresent) {
        System.out.println(textToPresent);
        String input = scanner.next();
        return input;
    }

    public static void main(String[] args) {
        new Main().executeApp();
    }
}
