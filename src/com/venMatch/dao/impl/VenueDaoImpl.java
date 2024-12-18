package com.venMatch.dao.impl;

import com.venMatch.dao.interfaces.VenueDao;
import com.venMatch.model.Venue;
import com.venMatch.util.VenMatchUtility;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class VenueDaoImpl implements VenueDao {

    private static List<Venue> venues = new ArrayList<>();

    @Override
    public void createVenue(VenMatchUtility venMatchUtility, String path) throws Exception {
        this.venues = venMatchUtility.readFromCSV("/Users/sachingupta.vc/Downloads/venSheet.csv", Venue.class);
    }

    @Override
    public void print(int i) {
        int limit = Math.min(i, venues.size());

        for (int j = 0; j < limit; j++) {
            System.out.println(venues.get(j));
        }
    }

    @Override
    public List<Venue> getAllVenues() {
        return venues;
    }

    @Override
    public Venue getVenueById(Integer id) {
        Optional<Venue> venue = venues.stream()
                .filter(v -> v.getId().equals(id))
                .findFirst();
        return venue.orElse(null);
    }
}
