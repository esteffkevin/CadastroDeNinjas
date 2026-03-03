package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é a minha primeira mensagem nessa rota";
    }

    // CRUD (Create, Read, Update, Delete)
    // Adicionar Ninjas (CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado: ";
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    // Mostrar Ninjas por ID (READ)
    @GetMapping("/listarID")
    public String mostrarTodosOsNinjasPorID(){
        return "Mostrar ninja por ID: ";
    }

    // Alterar dados dos Ninjas (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjaPorID(){
        return "Alterar ninja por ID: ";
    }

    // Deletar Ninjas por ID(DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorID(){
        return "Ninja deletado por ID: ";
    }
}
