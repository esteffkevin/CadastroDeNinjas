package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas") // Define qual rota (URL) será usada para acessar a classe ou métod0.
// assim evitando repetiçao como no exemplo abaixo /boasvindas. rota única.

public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é a minha primeira mensagem nessa rota";
    }

    // CRUD (Create, Read, Update, Read)
    // Adicionar Ninja (CREATE)
    //"Input do usuario e jogando no banco de dados"
    @PostMapping("/criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja) {
        return ninjaService.criarNinja(ninja);
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    //localhost:8080/listar/{id}
    // Mostrar Ninjas por ID (READ)
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorID(@PathVariable Long id){//PathVariable a variavel vai ser parte do caminho.
        return ninjaService.listarNinjasPorID(id);
    }

    // Alterar dados dos Ninjas (UPDATE)
    // Pegar o ID e depois input do que vai ser atualiaado
    @PutMapping("/alterar/{id}")
    public NinjaModel alterarNinjaPorID(@PathVariable Long id, @RequestBody NinjaModel ninjaAtualizado){
        return ninjaService.atualizarNinja(id, ninjaAtualizado);
    }

    // Deletar Ninja (DELETE) - Nao retorna nada!
    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaPorID(@PathVariable Long id){
        ninjaService.deletarNinjaPorID(id);
    }
}
