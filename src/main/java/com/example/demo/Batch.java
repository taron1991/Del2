package com.example.demo;

import java.util.List;

public class Batch {
    public void methodX(List<String> peoples) {
        peoples.stream().forEach(System.out::println);
    }

    public void methodY() {

    }
}
