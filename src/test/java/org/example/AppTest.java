package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;
import reactor.test.StepVerifier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void test() {
        /**
         * Functional interfaces.
         */
        Flux<String> items  = Flux.fromArray(new String[] {"one","two", "three"});
        items.subscribeOn(Schedulers.elastic())
                .subscribe(System.out::println);

        StepVerifier.create(items)
                .expectNextCount(3)
                .verifyComplete();


    }

}
