package com.thirdlayer.buscatcher.net;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.RestAdapter;
import retrofit.converter.SimpleXMLConverter;

@Module
final public class NextBusModule {

    public NextBusModule() {
    }

    @Singleton
    @Provides
    NextBusService nextBusService() {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("http://webservices.nextbus.com/service")
                .setConverter(new SimpleXMLConverter())
                .build();
        return restAdapter.create(NextBusService.class);
    }
}
