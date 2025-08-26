package dev.java10x.CadastroDeNinjas;
import jakarta.persistence.*;

//Entity- transforma uma class em uma entidade do banco de dados.
//JPA = Java Persistence API
@Entity
@Table(name="tb_cadastro")
public class NinjaModel {

    @Id // Irá marcar o Long id como chave primária(PK) da tabela. Sempre o atributo logo abaixo do @Id sera a PK.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // estratégia pra gerar o Id automaticamente
    Long id;
    String nome;
    String email;
    int idade;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
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
