package test;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class SenderService {
    @Inject
    private RestClient apiClient;
}
