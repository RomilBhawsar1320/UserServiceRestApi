package com.newgen.UserServiceRestApi.model;

import jakarta.persistence.*;
import lombok.Data;
import com.newgen.UserServiceRestApi.model.Company;
import com.newgen.UserServiceRestApi.model.Address;
import lombok.extern.slf4j.Slf4j;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String username;
    private String email;
    private String phone;
    private String website;
}
