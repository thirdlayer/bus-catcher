package com.thirdlayer.buscatcher.pojos;


import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import io.realm.RealmList;
import io.realm.RealmObject;

@Root(name = "body")
public class RouteList extends RealmObject {
    @ElementList(name = "route", inline=true)
    private RealmList<Route> routes;

    @Attribute(name = "copyright")
    private String copyright;

    public RealmList<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(RealmList<Route> routes) {
        this.routes = routes;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }
}
