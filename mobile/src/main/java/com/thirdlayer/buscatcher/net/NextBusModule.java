package com.thirdlayer.buscatcher.net;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.RestAdapter;

/**
 * Created by harry on 1/25/15.
 */
@Module(
        injects = {
                NextBusService.class
        }
)
public class NextBusModule {

    @Provides @Singleton public NextBusService provideNextBusService() {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("http://webservices.nextbus.com/service/publicXMLFeed?command=")
                .build();
        return restAdapter.create(NextBusService.class);
    }
}
