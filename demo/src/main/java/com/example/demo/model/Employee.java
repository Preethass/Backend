package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //Treat this Java class as a database entity.
@Table(name="employee")
@Data //automatically generates several common methods for you, including:
//Getters
//Setters
//toString()
//equals()
//hashCode()
@AllArgsConstructor //automatically creates a constructor containing all fields
@NoArgsConstructor //It creates a constructor with no arguments.
public class Employee {
    @Id //tells JPA that this is the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // generate the id automatically when new data created
    private Integer id;
    private String name;
    private String role;
}
