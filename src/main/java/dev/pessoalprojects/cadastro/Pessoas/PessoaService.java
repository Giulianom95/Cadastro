package dev.pessoalprojects.cadastro.Pessoas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {
    private PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    // Listar todas as pessoas
    public List<PessoaModel> listarPessoas() {
        return pessoaRepository.findAll();
    }

    // Listar pessoas por id
    public PessoaModel listarPessoaPorId(Long id) {
        Optional<PessoaModel> pessoaPorId = pessoaRepository.findById(id);
        return pessoaPorId.orElse(null);
    }
}
