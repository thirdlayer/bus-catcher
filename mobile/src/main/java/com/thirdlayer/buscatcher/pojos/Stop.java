package com.thirdlayer.buscatcher.pojos;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

import io.realm.RealmObject;
import io.realm.annotations.Index;
import io.realm.annotations.PrimaryKey;

@Root(name = "stop")
public class Stop extends RealmObject{
    @PrimaryKey
    @Attribute(name = "tag")
    private String tag;

    @Attribute(name = "title", required = false)
    private String title;

    @Attribute(name = "lat", required = false)
    private double latitude;

    @Attribute(name = "lon", required = false)
    private double longitude;

    @Attribute(name = "stopId", required = false)
    private String stopId;

    public Stop() {
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getStopId() {
        return stopId;
    }

    public void setStopId(String stopId) {
        this.stopId = stopId;
    }
}