package com.venMatch.service.impl;

import com.venMatch.dao.impl.VenueDaoImpl;
import com.venMatch.dao.interfaces.VenueDao;
import com.venMatch.service.interfaces.VenueService;
import com.venMatch.util.VenMatchUtility;

public class VenueServiceImpl implements VenueService {

    private VenueDao venueDao;

    public VenueServiceImpl() {
        this.venueDao = new VenueDaoImpl();
    }

    @Override
    public void createVenue(VenMatchUtility venMatchUtility, String path) throws Exception {
        venueDao.createVenue(venMatchUtility, path);
    }

    @Override
    public void printVenue(int i) {
        venueDao.print(i);
    }
}
