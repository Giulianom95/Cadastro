package dev.pessoalprojects.cadastro.Tarefas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tarefas")
public class TarefasController {
    private TarefasService tarefasService;

    public TarefasController(TarefasService tarefasService) {
        this.tarefasService = tarefasService;
    }

    @PostMapping("/criar")
    public TarefasModel criarTarefa(@RequestBody TarefasModel tarefa) {
        return tarefasService.criarTarefa(tarefa);
    }

    @GetMapping("/listar")
    public List<TarefasModel> mostrarTarefa() {
        return tarefasService.mostrarTarefa();
    }

    @GetMapping("/listar/{id}")
    public TarefasModel listarTarefaPorId(@PathVariable Long id) {
        return tarefasService.listarTarefaPorId(id);
    }

    @PutMapping("/alterar/{id}")
    public TarefasModel alterarTarefaPorId(@PathVariable Long id, @RequestBody TarefasModel tarefaAtualizada) {
        return tarefasService.alterarTarefaPorId(id, tarefaAtualizada);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarPorId(@PathVariable Long id) {
        tarefasService.deletarPorId(id);
    }


}
