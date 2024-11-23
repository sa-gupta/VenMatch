package com.venMatch.dao.interfaces;

import com.venMatch.model.Venue;
import com.venMatch.util.VenMatchUtility;

import java.util.List;

public interface VenueDao {
    void createVenue(VenMatchUtility venMatchUtility, String path) throws Exception;

    void print(int i);

    List<Venue> getAllVenues();

    Venue getVenueById(Integer id);
}
