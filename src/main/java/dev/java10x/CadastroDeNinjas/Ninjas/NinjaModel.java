package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// Entity transforma a classe numa tabela do banco de dados
// JPA Java Persistence API, é a especificação de persistência de dados em Java
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class NinjaModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    @Column(name = "id") // nome da coluna no banco de dados
    private Long id;

    @Column(name = "nome") // nome da coluna no banco de dados
    private String nome;

    @Column(unique = true) // email tem que ser unico
    private String email;

    @Column(name = "img_url") // nome da coluna no banco de dados
    private String imgUrl;

    @Column (name = "idade") // nome da coluna no banco de dados
    private int idade;


    //@ManyToOne um ninja tem uma unica missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing key | nome da coluna que vai ser criada no banco de dados
    private MissoesModel missoes;


}
