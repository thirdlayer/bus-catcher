package com.thirdlayer.buscatcher.net;

import retrofit.http.GET;

/**
 * Created by harry on 1/10/15.
 */
public interface NextBusService {
    //TODO: Add retry based on nextbus xml error value
    // http://www.nextbus.com/xmlFeedDocs/NextBusXMLFeed.pdf
    @GET("http://webservices.nextbus.com/service/publicXMLFeed?command=routeList&a=sf-muni")

}
