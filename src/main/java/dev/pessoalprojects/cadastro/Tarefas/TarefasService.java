package dev.pessoalprojects.cadastro.Tarefas;

import dev.pessoalprojects.cadastro.Pessoas.PessoaModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefasService {
    private TarefasRepository tarefasRepository;

    public TarefasService(TarefasRepository tarefasRepository) {
        this.tarefasRepository = tarefasRepository;
    }

    // Listar todas as tarefas
    public List<TarefasModel> mostrarTarefa() {
        return tarefasRepository.findAll();
    }

    // Listtar tarefa por id
    public TarefasModel listarTarefaPorId(Long id) {
        Optional<TarefasModel> tarefaPorId = tarefasRepository.findById(id);
        return tarefaPorId.orElse(null);
    }

    // Deletar tarefa por id
    public void deletarPorId(Long id) {
        tarefasRepository.deleteById(id);
    }

    /// Criar tarefa
    public TarefasModel criarTarefa(TarefasModel tarefa) {
        return tarefasRepository.save(tarefa);
    }

    /// Alterar por id
    public TarefasModel alterarTarefaPorId(Long id, TarefasModel tarefaAtualizada) {
        if (tarefasRepository.existsById(id)) {
            tarefaAtualizada.setId(id);
            return tarefasRepository.save(tarefaAtualizada);
        }
        return null;
    }
}
