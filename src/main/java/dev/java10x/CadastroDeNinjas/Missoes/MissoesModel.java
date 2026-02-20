package dev.java10x.CadastroDeNinjas.Missoes;
import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissoesModel {

    @Id // Marcar o Long id como PK dessa tabela de missoes
    @GeneratedValue(strategy = GenerationType.IDENTITY) // estratégia para gerar o ID automaticamente
    private Long id;

    private String nome;

    private String dificuldade;

    // @OneToMany - Uma missao pode ter vários ninjas
    // mappedBy - nome da cluna da outra classe que vamos trabalhar
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

}