package com.thirdlayer.buscatcher.pojos;

/**
 * Pojo representation of the Route object available on the NextBus xml feed.
 */
public class Route {

    private String title;
    private String tag;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
