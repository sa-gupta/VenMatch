package com.venMatch;

import com.venMatch.service.impl.CustomerServiceImpl;
import com.venMatch.service.impl.VenueServiceImpl;
import com.venMatch.service.interfaces.CustomerService;
import com.venMatch.service.interfaces.VenueService;
import com.venMatch.util.VenMatchUtility;

import java.util.Scanner;

public class Main {

    private final CustomerService customerService;
    private final VenueService venueService;
    private final Scanner inputScanner;
    private final VenMatchUtility venMatchUtility;

    public Main() {
        this.inputScanner = new Scanner(System.in);
        this.customerService = new CustomerServiceImpl();
        this.venueService = new VenueServiceImpl();
        this.venMatchUtility = new VenMatchUtility();
    }

    void executeApp() {
        try {
            customerService.createCustomer(venMatchUtility, readFromConsole("Enter CSV path for customer creation"));

            venueService.createVenue(venMatchUtility, readFromConsole("Enter CSV path for venue creation"));

        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            inputScanner.close();
        }
    }

    private String readFromConsole(String prompt) {
        System.out.println(prompt);
        return inputScanner.nextLine();
    }

    public static void main(String[] args) {
        new Main().executeApp();
    }
}
