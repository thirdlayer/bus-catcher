package com.thirdlayer.buscatcher.pojos;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

/**
 * Pojo representation of the Route object available on the NextBus xml feed.
 */
@Root(name = "route")
public class Route {
    @Attribute(name = "tag")
    private String tag;

    @Attribute(name = "title")
    private String title;

    public Route() {}
}
