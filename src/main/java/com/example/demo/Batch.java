package com.example.demo;

import java.util.List;

public class Batch {
    public List<String> methodX(List<String> peoples) {
        peoples.stream().forEach(System.out::println);
        return peoples;
    }

    public void methodY() {

    }
}
