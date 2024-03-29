package org.motion.motion_api.domain.entities.pitstop;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.motion.motion_api.domain.entities.Oficina;

import java.time.LocalDate;


@Table(name = "Pitstop_Financeiro")
@Entity(name = "Financeiro")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Financeiro {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFinanceiro;
    private String tipo;
    private String descricao;
    private LocalDate data;
    private Double valor;
    private String categoria;
    private String formaPagamento;

    @OneToOne @JoinColumn(name = "fkOficina") @NotNull
    private Oficina oficina;
}
