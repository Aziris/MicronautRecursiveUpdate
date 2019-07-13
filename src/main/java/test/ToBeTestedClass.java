package test;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ToBeTestedClass {
    @Inject
    RestClient apiClient;

    public  int getValue(){
        return 3;
    }
}
