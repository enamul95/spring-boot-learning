package com.app.entity;

import javax.persistence.*;

@Entity
@Table(name = "userinfo")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String userName;
    private String email;
}
