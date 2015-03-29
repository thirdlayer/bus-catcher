package com.thirdlayer.buscatcher.net;

import com.thirdlayer.buscatcher.activities.MainActivity;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.RestAdapter;
import retrofit.converter.SimpleXMLConverter;

/**
 * Created by harry on 1/25/15.
 */
@Module(
        injects = {
                MainActivity.class
        }
)
public class NextBusModule {

    @Provides @Singleton public NextBusService provideNextBusService() {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("http://webservices.nextbus.com/service")
                .setConverter(new SimpleXMLConverter())
                .build();
        return restAdapter.create(NextBusService.class);
    }
}
