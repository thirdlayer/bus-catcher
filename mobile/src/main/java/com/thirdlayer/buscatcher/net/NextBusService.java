package com.thirdlayer.buscatcher.net;

import com.thirdlayer.buscatcher.pojos.Route;

import java.util.ArrayList;

import retrofit.http.GET;

/**
 * Created by harry on 1/10/15.
 */
public interface NextBusService {
    //TODO: Add retry based on nextbus xml error value
    // http://www.nextbus.com/xmlFeedDocs/NextBusXMLFeed.pdf

    @GET("http://webservices.nextbus.com/service/publicXMLFeed?command=routeList&a=sf-muni")
    public ArrayList<Route> getAllRoutes();

}
