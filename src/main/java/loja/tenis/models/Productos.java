package loja.tenis.models;

import java.util.UUID;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;



@Data
@Entity
@Table(name = "produtos") 
public class Productos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", unique  = true)
    @SuppressWarnings("deprecation")
    @NotNull
    private UUID id;

    
    @SuppressWarnings("deprecation")
    @Column(length = 100, nullable = false)
    @NotNull
    private String nomeProduto;

    @SuppressWarnings("deprecation")
    @Column(length = 100, nullable = false)
    @NotNull
    private double preco;

    
    @SuppressWarnings("deprecation")
    @Column(length = 250, nullable = false)
    @NotNull
    private String descricao;

}
