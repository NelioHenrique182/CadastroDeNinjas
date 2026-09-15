package dev.java10x.CadastroDeNinjas.Ninjas.Service;

import dev.java10x.CadastroDeNinjas.Ninjas.Model.NinjaModel;
import dev.java10x.CadastroDeNinjas.Ninjas.Model.NinjaRepository;
import dev.java10x.CadastroDeNinjas.Ninjas.NinjaDTO;
import dev.java10x.CadastroDeNinjas.Ninjas.NinjaMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private final NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    //Listar todos os meus ninjas
    public List<NinjaModel> listarNinjas() {
        return ninjaRepository.findAll().stream().toList();
    }

    @PostMapping("/criar")
    public String criarNinjas() {
        return "Ninja criado com sucesso!";
    }

    //Listar todos meus ninjas por id
    public NinjaModel listarNinjasPorId(Long id) {
        Optional<NinjaModel> ninjaPorid = ninjaRepository.findById(id);
        return ninjaPorid.orElse(null);
    }

    //Criar um novo ninja
    public NinjaDTO criarNinja(NinjaDTO ninjaDTO) {
        NinjaModel ninja = ninjaMapper.map(ninjaDTO);
       ninja = ninjaRepository.save(ninja);
        return ninjaMapper.map(ninja);
    }

    // deletar um ninja - Tem que ser um metodo void, pois não retorna nada, apenas deleta o ninja do banco de dados
    public void deletarNinjaPorId(Long id) {
        ninjaRepository.deleteById(id);

    }

    //Atualizar Ninja
    public NinjaModel atualizarNinja(Long id, NinjaModel ninjaAtualizado){
        if (ninjaRepository.existsById(id)) {
            ninjaAtualizado.setId(id);
            return ninjaRepository.save(ninjaAtualizado);
        }
            return null;


    }
}