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

    //Listar todas as pessoas
    public List<PessoaModel> listarPessoas() {
        return pessoaRepository.findAll();
    }

    //Listar pessoas por id
    public PessoaModel listarPessoaPorId(Long id) {
        Optional<PessoaModel> pessoaPorId = pessoaRepository.findById(id);
        return pessoaPorId.orElse(null);
    }

    //Criar pessoa
    public PessoaModel criarPessoa(PessoaModel pessoa) {
        return pessoaRepository.save(pessoa);
    }

    //Deletar pessoa por id(precisa ser um metodo void)
    public void deletarPessoaPorId(Long id) {
        pessoaRepository.deleteById(id);
    }

    //Atualizar pessoa por id
    public PessoaModel alterarPessoaPorId(Long id, PessoaModel pessoaAtualizada) {
        if (pessoaRepository.existsById(id)) {
            pessoaAtualizada.setId(id);
            return pessoaRepository.save(pessoaAtualizada);
        }
        return null;
    }

}