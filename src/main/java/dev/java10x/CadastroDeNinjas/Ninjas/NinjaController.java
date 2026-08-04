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
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota!";
    }

    // adicionar ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinjas() {
        return "Ninja criado com sucesso!";
    }

    // Mostrar todos os ninjas (Read)
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    // Mostrar ninja por id (Read)
    @GetMapping("/listarId/{id}")
    public NinjaModel listarNinjasPorId(@PathVariable Long id) {
        return ninjaService.listarNinjasPorId(id);
    }

    // Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterarId")
    public String alterarNinjaPorId() {
        return "Alterar Ninja por id";
    }

    // Deletar ninja (DELETE)
    @DeleteMapping("/deletarId")
    public String deletarNinjaPorId() {
        return "Ninja deletado por id";
    }


}

