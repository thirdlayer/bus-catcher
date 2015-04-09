package com.thirdlayer.buscatcher.pojos;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

import io.realm.RealmObject;

@Root(name = "point")
public class Point extends RealmObject{
    @Attribute(name = "lat")
    private String latitude;

    @Attribute(name = "lon")
    private String longitude;

    public Point() {
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}