package dev.pessoalprojects.cadastro.Tarefas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("tarefas")
public class TarefasController {
    @PostMapping("/criar")
    public String criarTarefa() {
        return "Tarefa criada com sucesso";
    }

    @GetMapping("/listar")
    public String mostrarTarefa() {
        return "Tarefas listadas com sucesso";
    }

    @GetMapping("/listarID")
    public String mostrarPorId() {
        return "Mostrar tarefa por id";
    }

    @PutMapping("/alterarID")
    public String alterarTarefaPorId() {
        return "Tarefa Alterada";
    }

    @DeleteMapping("/deletarID")
    public String deletarPorId() {
        return "Deletar por id";
    }
}
