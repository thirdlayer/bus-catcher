package com.thirdlayer.buscatcher.pojos;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import io.realm.RealmList;
import io.realm.RealmObject;

@Root(name = "path")
public class Path extends RealmObject {

    @ElementList(name = "point", inline = true)
    private RealmList<Point> points;

    public Path() {
    }

    public RealmList<Point> getPoints() {
        return points;
    }

    public void setPoints(RealmList<Point> points) {
        this.points = points;
    }
}