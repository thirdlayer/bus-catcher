package com.thirdlayer.buscatcher;

import com.thirdlayer.buscatcher.net.NextBusModule;

public class Application extends android.app.Application {
    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        this.component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .nextBusModule(new NextBusModule())
                .build();
        component.application(this);
    }

    ApplicationComponent getComponent() {
        return component;
    }

}
