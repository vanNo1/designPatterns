package com.van.designpattern.optional;

import java.util.Objects;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String s = "123";
        Optional<String> nullable = Optional.ofNullable(s);
        String s1 = nullable.map(String::toCharArray).filter(item -> item.length > 5).map(String::new).orElse("321");
        System.out.println(s1);
    }
}
