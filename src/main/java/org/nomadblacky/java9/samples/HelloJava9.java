package org.nomadblacky.java9.samples;

import java.util.Optional;

public class HelloJava9 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.empty();
        Optional<String> o2 = Optional.of("Java9!");

        System.out.println("Hello " + o1.or(() -> o2).orElse(""));
    }
}
