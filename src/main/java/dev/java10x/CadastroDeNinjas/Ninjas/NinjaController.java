package dev.java10x.CadastroDeNinjas.Ninjas;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

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
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas() {
        return "Mostrando todos os ninjas cadastrados!";
    }

    // Mostrar ninja por id (Read)
    @GetMapping("/todosPorId")
    public String mostrarTodosOsNinjasPorId() {
        return "Mostrar todos os ninjas cadastrados por id!";
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

