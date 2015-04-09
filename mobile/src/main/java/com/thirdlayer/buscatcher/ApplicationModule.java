package com.thirdlayer.buscatcher;

import dagger.Module;
import dagger.Provides;

@Module
final class ApplicationModule {
    private final Application application;

    ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides
    Application application() {
        return application;
    }
}
