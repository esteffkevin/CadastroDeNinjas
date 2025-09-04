package dev.java10x.CadastroDeNinjas.Ninjas;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;


@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    // Iniciar o construtor quando injeta uma dependencia
    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // Listar todos os ninjas
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }

    // Metodo Listar todos os ninjas por ID
    // O usuário vai passar um ID pra procura = Long id
    public NinjaModel listarNinjasPorID(Long id){
        //O ninja por existir OU nao (Optional)
        Optional<NinjaModel> ninjaPorID = ninjaRepository.findById(id);
        return ninjaPorID.orElse(null);
    }

    // Criar um novo ninja
    public NinjaModel criarNinja(NinjaModel ninja){
        return ninjaRepository.save(ninja); // .save = INSERT INTO basicamente
    }
}