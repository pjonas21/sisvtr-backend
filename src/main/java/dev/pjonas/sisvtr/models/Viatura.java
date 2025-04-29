package dev.pjonas.sisvtr.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Table(name = "tbl_viaturas")
public class Viatura  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    @Column(name = "prefixo_vtr")
    private String prefixoVtr;
    @Column(name = "placa_vtr", unique = true)
    private String placaVtr;
    @Column(name = "status_vtr")
    private String statusVtr;
    @Column(name = "criado_em")
    @CreationTimestamp()
    private LocalDateTime criadoEm;
    @Column(name = "atualizado_em")
    @UpdateTimestamp()
    private LocalDateTime atualizadoEm;

    public Viatura(UUID id, String prefixoVtr, String placaVtr, String statusVtr, LocalDateTime criadoEm, LocalDateTime atualizadoEm) {
        this.id = id;
        this.prefixoVtr = prefixoVtr;
        this.placaVtr = placaVtr;
        this.statusVtr = statusVtr;
        this.criadoEm = criadoEm;
        this.atualizadoEm = atualizadoEm;
    }

    public Viatura() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getPrefixoVtr() {
        return prefixoVtr;
    }

    public void setPrefixoVtr(String prefixoVtr) {
        this.prefixoVtr = prefixoVtr;
    }

    public String getPlacaVtr() {
        return placaVtr;
    }

    public void setPlacaVtr(String placaVtr) {
        this.placaVtr = placaVtr;
    }

    public String getStatusVtr() {
        return statusVtr;
    }

    public void setStatusVtr(String statusVtr) {
        this.statusVtr = statusVtr;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
    }

    public LocalDateTime getAtualizadoEm() {
        return atualizadoEm;
    }

    public void setAtualizadoEm(LocalDateTime atualizadoEm) {
        this.atualizadoEm = atualizadoEm;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Viatura viatura = (Viatura) o;
        return Objects.equals(id, viatura.id) && Objects.equals(prefixoVtr, viatura.prefixoVtr) && Objects.equals(placaVtr, viatura.placaVtr) && Objects.equals(statusVtr, viatura.statusVtr) && Objects.equals(criadoEm, viatura.criadoEm) && Objects.equals(atualizadoEm, viatura.atualizadoEm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, prefixoVtr, placaVtr, statusVtr, criadoEm, atualizadoEm);
    }

    @Override
    public String toString() {
        return "Viatura{" +
                "id=" + id +
                ", prefixoVtr='" + prefixoVtr + '\'' +
                ", placaVtr='" + placaVtr + '\'' +
                ", statusVtr='" + statusVtr + '\'' +
                ", criadoEm=" + criadoEm +
                ", atualizadoEm=" + atualizadoEm +
                '}';
    }
}
