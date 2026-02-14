package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

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
    // @JoinColumn para a criaçao de uma nova coluna para a Foreing Key (FK)
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}