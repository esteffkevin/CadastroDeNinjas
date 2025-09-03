package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas") // Define qual rota (URL) será usada para acessar a classe ou métod0.
// assim evitando repetiçao como no exemplo abaixo /boasvindas. rota única.

public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é a minha primeira mensagem nessa rota";
    }

    // CRUD (Create, Read, Update, Read)
    // Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado: ";
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/listar")
    public String mostrarTodosOsNinjas(){
        return "Mostrar todos os ninjas: ";
    }

    // Mostrar Ninjas por ID (READ)
    @GetMapping("/listarID")
    public String mostrarTodosOsNinjasPorID(){
        return "Mostrar ninjas por ID: ";
    }

    // Alterar dados dos Ninjas (UPDATE)
    @PutMapping("/alterar")
    public String alterarNinjaPorID(){
        return "Alterar ninja por ID: ";
    }

    // Deletar Ninja (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorID(){
        return "Ninja deletado por ID: ";
    }

}
