package loja.tenis.models;

import java.util.UUID;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@SuppressWarnings("deprecation")
@Entity
@Table(name = "user")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column( unique  = true)
    @NotNull
    private UUID  id;

    @Column( length = 100, nullable = false, unique = true)
    @NotNull
    private String name;

    @Column( length = 100, nullable = false, unique = true)
    @NotNull
    private String email;

    
    @Column( length = 60, nullable = false)
    @NotNull
    private String password;
}
