package loja.tenis.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import loja.tenis.models.Productos;

@Repository
public interface ProductosRepository  extends JpaRepository<Productos, UUID>{}
