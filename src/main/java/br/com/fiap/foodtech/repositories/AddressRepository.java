package br.com.fiap.foodtech.repositories;

import br.com.fiap.foodtech.model.AddressModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddressRepository extends JpaRepository<AddressModel, UUID> {
}
