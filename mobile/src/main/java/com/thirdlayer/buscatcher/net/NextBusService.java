package com.thirdlayer.buscatcher.net;

import com.thirdlayer.buscatcher.pojos.RouteList;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

public interface NextBusService {
    //TODO: Add retry based on nextbus xml error value
    // http://www.nextbus.com/xmlFeedDocs/NextBusXMLFeed.pdf
    // http://webservices.nextbus.com/service

    @GET("/publicXMLFeed?command=routeConfig&a={agencyTag}")
    public void getAllRoutes(
            @Path("agencyTag") String agencyTag,
            Callback<RouteList> callback);

    @GET("/publicXMLFeed?command=routeList&a=sf-muni")
    public void getAllRoutes(Callback<RouteList> callback);

}
