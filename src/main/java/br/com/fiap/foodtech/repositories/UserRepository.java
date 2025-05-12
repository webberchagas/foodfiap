package br.com.fiap.foodtech.repositories;

import br.com.fiap.foodtech.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserModel, UUID> {
}
