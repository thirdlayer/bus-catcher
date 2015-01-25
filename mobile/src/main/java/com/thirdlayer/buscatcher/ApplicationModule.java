package com.thirdlayer.buscatcher;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by harry on 1/24/15.
 */
@Module(
        injects ={
                Application.class
        }
)
public class ApplicationModule {

    private Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides @Singleton public Context provideApplicationContext() {
        return application;
    }
}
