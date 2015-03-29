package com.thirdlayer.buscatcher.pojos;


import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by harry on 3/29/15.
 */
@Root(name = "body")
public class RouteList {
    @ElementList(name = "route", inline=true)
    private List<Route> routes;

    @Attribute(name = "copyright")
    private String copyright;

    public List<Route> getRoutes() {
        return routes;
    }
}
