package com.venMatch.dao.impl;

import com.venMatch.dao.interfaces.VenueDao;
import com.venMatch.model.Venue;
import com.venMatch.util.VenMatchUtility;

import java.util.ArrayList;
import java.util.List;

public class VenueDaoImpl implements VenueDao {

    private List<Venue> venues = new ArrayList<>();

    @Override
    public void createVenue(VenMatchUtility venMatchUtility, String path) throws Exception {
        this.venues = venMatchUtility.readFromCSV(path, Venue.class);
    }
}
