package com.example.boardbe.domain.user.domain.Repository;

import jakarta.persistence.*;
import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 15,nullable = false)
    private String accountId;

    @Column(length = 5,nullable = false)
    private String name;

    @Column(length = 20,nullable = false)
    private String password;

    @Column(length = 20,nullable = false)
    private String phoneNumber;

    @Builder
    private User(String accountId, String name, String password, String phoneNumber) {
        this.accountId = accountId;
        this.name=name;
        this.password=password;
        this.phoneNumber=phoneNumber;
    }
}
