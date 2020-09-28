package br.com.rhyan14.api_Clientes.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter@Setter
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column
    private String NOME;
    @Column
    private String CPF;
    @Column
    private String CNPJ;
    @Column
    private String TELEFONE;
    @Column
    private String ENDERECO;
}
