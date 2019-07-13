package test;

import io.micronaut.context.annotation.Context;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
@Context
public class ContextClass {

    @Inject
    private SenderService senderService;

    void initialize() {
        // something here
    }

}

