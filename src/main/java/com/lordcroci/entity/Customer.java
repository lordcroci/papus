package com.lordcroci.entity;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@ToString
@Entity
@Table(name = "CUSTOMER")
public class Customer
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private int id;

    @NonNull
    @Column(name = "first_name")
    private String firstName;

    @NonNull
    @Column(name = "last_name")
    private String lastName;

    @NonNull
    @Column(name = "email")
    private String email;
}
