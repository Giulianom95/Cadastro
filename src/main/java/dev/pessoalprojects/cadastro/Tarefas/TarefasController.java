package dev.pessoalprojects.cadastro.Tarefas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("tarefas")
public class TarefasController {
    @GetMapping("/listar")
    public String mostrarTarefa(){
        return "Tarefas listadas com sucesso";
    }
    @PostMapping("/criar")
    public String criarTarefa(){
        return "Tarefa criada com sucesso";
    }
    @PutMapping("/alterarID")
    public String alterarTarefaPorId(){
        return "Tarefa Alterada";
    }
    @GetMapping("/listarID")
    public String mostrarPorId(){
        return "Mostrar tarefa por id";
    }
    @DeleteMapping("/DeletarID")
    public String deletarPorId(){
        return "Deletar por id";
    }
}
