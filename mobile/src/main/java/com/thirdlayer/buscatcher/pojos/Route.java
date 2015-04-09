package com.thirdlayer.buscatcher.pojos;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Pojo representation of the Route object available on the NextBus xml feed.
 */
@Root(name = "route")
public class Route extends RealmObject{
    @PrimaryKey
    @Attribute(name = "tag")
    private String tag;

    @Attribute(name = "title")
    private String title;

    @Attribute(name = "shortTitle")
    private String shortTitle;

    @Attribute(name = "color")
    private String color;

    @Attribute(name = "oppositeColor")
    private String oppositeColor;

    @Attribute(name = "latMin")
    private int latitudeMin;

    @Attribute(name = "latMax")
    private int latitudeMax;

    @Attribute(name = "lonMin")
    private int longitudeMin;

    @Attribute(name = "lonMax")
    private int longitudeMax;

    @ElementList(name = "stop", inline = true)
    private RealmList<Stop> stops;

    @ElementList(name = "direction", inline = true, required = false)
    private RealmList<Direction> directions;

    @ElementList(name = "path", inline = true)
    private RealmList<Path> paths;

    public Route() {}

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

    public String getShortTitle() {
        return shortTitle;
    }

    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOppositeColor() {
        return oppositeColor;
    }

    public void setOppositeColor(String oppositeColor) {
        this.oppositeColor = oppositeColor;
    }

    public int getLatitudeMin() {
        return latitudeMin;
    }

    public void setLatitudeMin(int latitudeMin) {
        this.latitudeMin = latitudeMin;
    }

    public int getLatitudeMax() {
        return latitudeMax;
    }

    public void setLatitudeMax(int latitudeMax) {
        this.latitudeMax = latitudeMax;
    }

    public int getLongitudeMin() {
        return longitudeMin;
    }

    public void setLongitudeMin(int longitudeMin) {
        this.longitudeMin = longitudeMin;
    }

    public int getLongitudeMax() {
        return longitudeMax;
    }

    public void setLongitudeMax(int longitudeMax) {
        this.longitudeMax = longitudeMax;
    }

    public RealmList<Stop> getStops() {
        return stops;
    }

    public void setStops(RealmList<Stop> stops) {
        this.stops = stops;
    }

    public RealmList<Direction> getDirections() {
        return directions;
    }

    public void setDirections(RealmList<Direction> directions) {
        this.directions = directions;
    }

    public RealmList<Path> getPaths() {
        return paths;
    }

    public void setPaths(RealmList<Path> paths) {
        this.paths = paths;
    }
}
