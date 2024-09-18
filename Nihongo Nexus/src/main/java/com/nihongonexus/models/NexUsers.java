package com.nihongonexus.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "nex_users")
public class NexUsers {

    @Id
    @SequenceGenerator(
            name = "seq_nex_users",
            sequenceName = "seq_nex_users",
            initialValue = 1,
            schema = "nn_schema"
    )
    @GeneratedValue(generator = "seq_nex_users", strategy = GenerationType.SEQUENCE)
    private long id;
    private String userName;
    private String password;

}
