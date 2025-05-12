package br.com.fiap.foodtech.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 11)
    private String cpf;

    @Column(nullable = false,unique = true)
    private String email;

    @Column(length = 20)
    private String phone;

    @Column(nullable = false)
    private String password_hash;

    @Enumerated(EnumType.STRING)
    private UserType type;

    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    @OneToMany(mappedBy = "user_id")
    private Set<AddressModel> addresses = new HashSet<>();
}
