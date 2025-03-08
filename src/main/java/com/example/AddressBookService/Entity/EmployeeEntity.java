package com.example.AddressBookService.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    // Default constructor
    public EmployeeEntity() {}

    // Constructor without ID (for new employee creation)
    public EmployeeEntity(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Constructor with ID (for returning DTOs)
    public EmployeeEntity(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
