package com.venMatch.dao.interfaces;

import com.venMatch.util.VenMatchUtility;

public interface VenueDao {
    void createVenue(VenMatchUtility venMatchUtility, String path) throws Exception;
}
