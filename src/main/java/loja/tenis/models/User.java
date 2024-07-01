package loja.tenis.models;

import java.util.UUID;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "user")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID  id;

    private String name;

    private String email;
}
