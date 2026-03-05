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
    public List<NinjaModel> listarNinjas() {
        //findAll é equivalente ao INSERT
        return ninjaRepository.findAll();
    }

    // Listar todos os ninjas por ID
    // O usuário vai passar um iD pra procura. Long ID neste caso.
    public NinjaModel listarNinjasPorId(Long id) {
        Optional<NinjaModel> ninjaPorID = ninjaRepository.findById(id);
        return ninjaPorID.orElse(null);
    }

    // Criar um novo ninja
    public NinjaModel criarNinja(NinjaModel ninja) {
        return ninjaRepository.save(ninja);
    }

    // Deletar Ninja - Tem que ser um metodo VOID
    public void deletarNinjaPorId(Long id) {
        ninjaRepository.deleteById(id);
    }

    // Atualizar ninja
    public NinjaModel atualizarNinja(Long id, NinjaModel ninjaAtualizado) {
        // checar se o ninja ja existe pelo id
        if (ninjaRepository.existsById(id)) {
            // colocar o id que deseja atualizar
            ninjaAtualizado.setId(id);
            // pegar no corpo da requisicao e salvar o ninja atualizado
            return ninjaRepository.save(ninjaAtualizado);
        }
        // caso nao exista, retorna null
        return null;
    }
}
