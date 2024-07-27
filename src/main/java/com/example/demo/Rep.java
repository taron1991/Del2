package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public interface Rep extends JpaRepository<Carf,Integer> {

  //  public static List<Carf> carfList = new ArrayList<>();




}
