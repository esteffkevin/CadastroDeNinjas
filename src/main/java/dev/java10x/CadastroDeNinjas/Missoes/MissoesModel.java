package dev.java10x.CadastroDeNinjas.Missoes;
import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="tb_missoes")
public class MissoesModel {

    @Id // Marcar o ID como PK dessa tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Estratégia para gerar o ID automaticamente
    private Long id;

    private String nome;

    private String dificuldade;

    //Uma missao poderá ter vários ninjas
    //@OneToMany
    //mappedBy = nome da coluna da outra classe que vamos trabalhar
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninja;




}