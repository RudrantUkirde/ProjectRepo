package com.example.dto;

import jakarta.persistence.Column;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {

    private String name;
    private String email;

    private String phone;
    private String kycId;

    private String address;
}
