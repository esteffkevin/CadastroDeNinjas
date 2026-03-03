package dev.java10x.CadastroDeNinjas.Ninjas;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // Listar todos os ninjas
    public List<NinjaModel> listarNinjas(){
        //findAll é equivalente ao INSERT
        return ninjaRepository.findAll();
    }

    // Listar todos os ninjas por ID
    // O usuário vai passar um iD pra procura. Lond ID neste caso.
    public NinjaModel listarNinjasPorId(Long id){
        Optional<NinjaModel> ninjaPorID = ninjaRepository.findById(id);
        return ninjaPorID.orElse(null);
    }
}
