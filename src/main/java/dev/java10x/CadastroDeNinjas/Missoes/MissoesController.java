package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")

public class MissoesController {

    // Get  -- Mandar uma requisição para mostrar as missoes
    @GetMapping("/listar")
    public String listarMissao() {
        return "Missoes listadas com sucesso!";
    }

    // Post -- Mandar uma requisição para criar uma nova missão
    @PostMapping("/criar")
    public String criarMissao() {
        return "Missão criada com sucesso!";
    }

    // Put -- Mandar uma requisição para alterar uma missão
    @PutMapping("/alterar")
    public String alterarMissao() {
        return "Missão alterada com sucesso!";
    }

    // Delete -- Mandar uma requisição para deletar uma missão
    @DeleteMapping("/deletar")
    public String deletarMissao() {
        return "Missão deletada com sucesso!";
    }






}
