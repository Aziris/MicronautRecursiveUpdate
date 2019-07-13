package test;

import io.micronaut.test.annotation.MicronautTest;
import io.micronaut.test.annotation.MockBean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.mockito.Mockito.*;


@MicronautTest
public class WithContextMockTest {

    @Inject
    ToBeTestedClass toBeTestedClass;

    @Test
    void testValidity() {
        int value = toBeTestedClass.getValue();

        Assertions.assertEquals(
                3,
                value
        );

    }

    @MockBean(RestClient.class)
    public RestClient getMockedClient(){
        RestClient client = mock(RestClient.class);
        return client;
    }
}
