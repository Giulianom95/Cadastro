package dev.pessoalprojects.cadastro.Pessoas;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class PessoaController {
    // Adicionar pessoa(CREATE)
    @PostMapping("/criar")
    public String criarPessoa() {
        return "Pessoa criada";
    }

    // Mostrar todas as pessoas(READ)
    @GetMapping("/listar")
    public String mostrarTodasAsPessoas() {
        return "Mostrar todas as pessoas";
    }

    // Mostrar pessoa por id(READ)
    @GetMapping("/listarID")
    public String mostrarPessoaPorId() {
        return "Mostrar pessoas por id";
    }

    // Alterar dados da pessoa(UPDATE)
    @PutMapping("/alterarID")
    public String alterarPessoaPorId() {
        return "Alterar pessoa por id";
    }

    // Deletar pessoa(DELETE)
    @DeleteMapping("/deletarID")
    public String deletarPessoaPorId() {
        return "Pessoa deletada por id";
    }
}
