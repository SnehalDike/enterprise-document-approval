package com.snehal.documentapproval.authservice.authentication.entity;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true)
    private String name;
    private String description;
    @ManyToMany(mappedBy = "roles")
    private Set<User> users=new HashSet<>();
}
