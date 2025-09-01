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
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    // Essa coluna é única sem items repetidos
    @Column(unique = true)
    private String email;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "idade")
    private int idade;

    //@ManyToOne
    //Na classe NinjaModel, MUITOS NINJAS vão ter UMA ÚNICA missao.
    @ManyToOne

    // @JoinColumn para a criacao de uma nova coluna para a Foreign Key (FK)
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;

}