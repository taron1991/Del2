package com.example.demo;


import jakarta.persistence.*;

@Entity
@Table(name = "Carf")
public class Carf {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String name;
}
