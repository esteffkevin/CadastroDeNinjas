package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController // <- isso aqui vai ser uma rota para as nossas APIs
@RequestMapping("missoes") // <- vai mapear as APIs
public class MissoesController {

    // GET -- Mandar uma requisicao para mostrar as missoes
    @GetMapping("/listar")
    public String listarMissoes(){
        return "Missoes listadas com sucesso";
    }

    // POST -- Mandar uma requisicao para criar as missoes
    @PostMapping("/criar") // <- "O usuário vai mandar pra mim"
    public String criarMissao(){
        return "Missao criada com sucesso";
    }

    // PUT -- Mandar uma requisicao para alterar as missoes
    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missao alterada com sucesso";
    }

    // DELETE -- Mandar uma requisicao para deletar as missoes
    @DeleteMapping("/deletar")
    public String deletarMissao() {
        return "Missao deletada com sucesso";
    }

}