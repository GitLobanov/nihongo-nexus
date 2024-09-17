package com.nihongonexus.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "nex_users")
public class NexUsers {

    @Id
    private long id;
    private String userName;
    private String password;

}
