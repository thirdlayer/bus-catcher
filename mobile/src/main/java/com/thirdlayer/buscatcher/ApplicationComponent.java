package com.thirdlayer.buscatcher;

import com.thirdlayer.buscatcher.net.NextBusService;
import com.thirdlayer.buscatcher.net.NextBusModule;
import dagger.Component;

@Component(
        modules = {
                ApplicationModule.class,
                NextBusModule.class
        }

)
public interface ApplicationComponent {
    Application application(Application application);
    NextBusService nextBusService(NextBusService nextBusService);
}
