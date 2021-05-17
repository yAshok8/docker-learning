package com.example.TransactionManagementBoot.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {

    @Id
    private int id;
    private String name;
}
