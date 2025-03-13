package com.newgen.UserServiceRestApi.dto;

import com.newgen.UserServiceRestApi.model.Address;
import com.newgen.UserServiceRestApi.model.Company;
import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;

}
