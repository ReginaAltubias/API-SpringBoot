package loja.tenis.models;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.validation.constraints.NotNull;



@Data
@Entity
@Table(name = "produtos") 
public class Productos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column( unique  = true)
    @NotNull
    private UUID id;

    
    @Column(length = 100, nullable = false)
    @NotNull
    private String nomeProduto;

    @Column(length = 100, nullable = false)
    @NotNull
    private double preco;

    @Column(length = 250, nullable = false)
    @NotNull
    private String descricao;

}
