package org.example.pitstop_api.domain.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Table(name = "Pitstop_ProdutoEstoque")
@Entity(name = "ProdutoEstoque")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProdutoEstoque {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProduto;
    private String nome;
    private String descricao;
    private Double quantidade;
    private String localizacao;
    private Double valorCompra;
    private Double valorVenda;

    @OneToOne @JoinColumn(name = "fkOficina") @NotNull
    private Oficina oficina;
}