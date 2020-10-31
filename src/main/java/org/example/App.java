package org.example;

import reactor.core.publisher.Flux;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        Flux<String> items  = Flux.fromArray(new String[] {"one","two", "three"});
    }
}
