package dev.java10x.CadastroDeNinjas.Ninjas;
import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Entity- transforma uma class em uma entidade do banco de dados.
//JPA = Java Persistence API
@Entity
@Table(name="tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id // Irá marcar o Long id como chave primária(PK) da tabela. Sempre o atributo logo abaixo do @Id sera a PK.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // estratégia pra gerar o Id automaticamente
    private Long id;

    private String nome;

    private String email;

    private int idade;

    //@ManyToOne
    //Na classe NinjaModel, MUITOS NINJAS vão ter UMA ÚNICA missao.
    @ManyToOne

    // @JoinColumn para a criacao de uma nova coluna para a Foreign Key (FK)
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;

}