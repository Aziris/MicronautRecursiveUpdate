package test;

import io.micronaut.context.annotation.Replaces;

import javax.inject.Singleton;

@Replaces(ContextClass.class)
@Singleton
public class MockHandler extends ContextClass {

    @Override
    void initialize() {
        // something else here
    }

}