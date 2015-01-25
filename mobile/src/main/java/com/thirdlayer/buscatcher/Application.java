package com.thirdlayer.buscatcher;

import android.os.Bundle;

import com.thirdlayer.buscatcher.net.NextBusModule;
import com.thirdlayer.buscatcher.net.NextBusService;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import dagger.ObjectGraph;

/**
 * Created by harry on 1/24/15.
 */
public class Application extends android.app.Application {
    private ObjectGraph objectGraph;

    @Inject
    NextBusService nextBusService;

    @Override
    public void onCreate() {
        super.onCreate();
        objectGraph = ObjectGraph.create(getModules().toArray());
        objectGraph.inject(this)

    }

    private List<Object> getModules() {
        return Arrays.<Object>asList(new ApplicationModule(this));
    }


}
