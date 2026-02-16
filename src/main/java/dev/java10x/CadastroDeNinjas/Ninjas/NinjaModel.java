package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
// Entity transforma uma classe em uma entidade do banco de dados
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id // Irá marcar a Long id como chave primária(PK) da tabelaa. Sempre o atributo logo abaixo do @Id sera a PK.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Estratégia pra gerar o Id automaticamente.
    private Long id;

    private String nome;

    private String email;

    private int idade;

    // @ManyToOne - um ninja tem uma única missao
    @ManyToOne
    // @JoinColumn para a criaçao de uma nova coluna para a Foreign Key (FK)
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;
}