package org.example.pitstop_api.domain.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;

@Table(name = "Pitstop_OrdemDeServico")
@Entity(name = "OrdemDeServico")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrdemDeServico {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOrdem;
    @NotNull
    private Date dataInicio;
    private Date dataFim;
    private String descricao;
    private String status;
    private Double valorTotal;


    @OneToOne @JoinColumn(name = "fkOficina") @NotNull
    private Oficina oficina;
    @OneToOne @JoinColumn(name = "fkVeiculo") @NotNull
    private Veiculo veiculo;
    @OneToOne @JoinColumn(name = "fkMecanico")
    private Mecanico mecanico;
}