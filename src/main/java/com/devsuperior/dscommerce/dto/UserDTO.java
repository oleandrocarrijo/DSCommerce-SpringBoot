package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.User;
import jakarta.persistence.Column;
import org.springframework.security.core.GrantedAuthority;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserDTO {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private LocalDate birthDate;


    private List<String> roles = new ArrayList<>();

    public UserDTO(User enitty) {
        id = enitty.getId();
        name = enitty.getName();
        email = enitty.getEmail();
        phone = enitty.getPhone();
        birthDate = enitty.getBirthdate();
        for (GrantedAuthority role : enitty.getRoles()) {
            roles.add(role.getAuthority());
        }
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public List<String> getRoles() {
        return roles;
    }
}
