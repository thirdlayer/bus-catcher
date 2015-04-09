package com.thirdlayer.buscatcher.pojos;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

@Root(name = "direction")
public class Direction extends RealmObject {
    @PrimaryKey
    @Attribute(name = "tag")
    private String tag;

    @Attribute(name = "title")
    private String title;

    @Attribute(name = "name")
    private String name;

    @Attribute(name = "useForUI")
    private String isUserFacing;

    @ElementList(name = "stop", inline = true)
    private RealmList<Stop> stops;

    public Direction() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsUserFacing() {
        return isUserFacing;
    }

    public void setIsUserFacing(String isUserFacing) {
        this.isUserFacing = isUserFacing;
    }

    public RealmList<Stop> getStops() {
        return stops;
    }

    public void setStops(RealmList<Stop> stops) {
        this.stops = stops;
    }
}