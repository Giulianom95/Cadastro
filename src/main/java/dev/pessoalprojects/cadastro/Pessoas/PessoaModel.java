package dev.pessoalprojects.cadastro.Pessoas;

import dev.pessoalprojects.cadastro.Tarefas.TarefasModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cadastro_de_pessoa")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class PessoaModel {
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String nome;
    @Column(unique = true)
    private String email;
    private int idade;
    @ManyToOne
    @JoinColumn(name = "Missoes_id")
    private TarefasModel tarefas;



}
