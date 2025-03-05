package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Entity transforma uma classe em uma entidade do Banco de Dados.
// JPA = Java Persistence API
@Entity
@Table(name = "cadastro_de_ninjas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    //Esta coluna será única, nao pode possuir dados repetidos.
    @Column(unique = true)
    private String email;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "idade")
    private int idade;

    // @ManyToOne - um ninja tem uma única missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreign Key ou chave estrangeira.
    private MissoesModel missoes;
}