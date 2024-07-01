package loja.tenis.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import loja.tenis.models.User;

@Repository

public interface UserRepository  extends JpaRepository<User, UUID> {
}