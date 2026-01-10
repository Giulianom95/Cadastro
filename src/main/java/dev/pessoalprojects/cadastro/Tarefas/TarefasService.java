package dev.pessoalprojects.cadastro.Tarefas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefasService {
    private TarefasRepository tarefasRepository;

    public TarefasService(TarefasRepository tarefasRepository) {
        this.tarefasRepository = tarefasRepository;
    }

    //Listar todas as tarefas
    public List<TarefasModel> mostrarTarefa() {
        return tarefasRepository.findAll();
    }

    //Listtar tarefa por id
    public TarefasModel listarTarefaPorId(Long id) {
        Optional<TarefasModel> tarefaPorId = tarefasRepository.findById(id);
        return tarefaPorId.orElse(null);
    }

}
