package dev.pjonas.sisvtr.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Table(name = "tbl_usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    @Column(name = "nome_de_guerra")
    private String nomeDeGuerra;
    @Column(name = "posto_graduacao", length = 25)
    private String postoGraduacao;
    @Column(name = "matricula", length = 20)
    private String matricula;
    @Column(name = "senha")
    private String senha;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "email")
    private String email;
    @Column(name = "admin")
    private boolean admin;
    @Column(name = "motorista")
    private boolean motorista;
    @Column(name = "registro_cnh")
    private String registroCnh;
    @Column(name = "categoria_cnh")
    private String categoriaCnh;
    @Column(name = "validade_cnh")
    private LocalDate validadeCnh;
    @Column(name = "criado_em")
    @CreationTimestamp()
    private LocalDateTime criadoEm;
    @Column(name = "atualizado_em")
    @UpdateTimestamp()
    private LocalDateTime atualizadoEm;


    public Usuario(UUID id, String nomeDeGuerra, String postoGraduacao, String matricula, String senha, String telefone, String email, boolean admin, boolean motorista, String registroCnh, String categoriaCnh, LocalDate validadeCnh, LocalDateTime criadoEm, LocalDateTime atualizadoEm) {
        this.id = id;
        this.nomeDeGuerra = nomeDeGuerra;
        this.postoGraduacao = postoGraduacao;
        this.matricula = matricula;
        this.senha = senha;
        this.telefone = telefone;
        this.email = email;
        this.admin = admin;
        this.motorista = motorista;
        this.registroCnh = registroCnh;
        this.categoriaCnh = categoriaCnh;
        this.validadeCnh = validadeCnh;
        this.criadoEm = criadoEm;
        this.atualizadoEm = atualizadoEm;
    }

    public Usuario() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNomeDeGuerra() {
        return nomeDeGuerra;
    }

    public void setNomeDeGuerra(String nomeDeGuerra) {
        this.nomeDeGuerra = nomeDeGuerra;
    }

    public String getPostoGraduacao() {
        return postoGraduacao;
    }

    public void setPostoGraduacao(String postoGraduacao) {
        this.postoGraduacao = postoGraduacao;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean isMotorista() {
        return motorista;
    }

    public void setMotorista(boolean motorista) {
        this.motorista = motorista;
    }

    public String getRegistroCnh() {
        return registroCnh;
    }

    public void setRegistroCnh(String registroCnh) {
        this.registroCnh = registroCnh;
    }

    public String getCategoriaCnh() {
        return categoriaCnh;
    }

    public void setCategoriaCnh(String categoriaCnh) {
        this.categoriaCnh = categoriaCnh;
    }

    public LocalDate getValidadeCnh() {
        return validadeCnh;
    }

    public void setValidadeCnh(LocalDate validadeCnh) {
        this.validadeCnh = validadeCnh;
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
        Usuario usuario = (Usuario) o;
        return admin == usuario.admin && motorista == usuario.motorista && Objects.equals(id, usuario.id) && Objects.equals(nomeDeGuerra, usuario.nomeDeGuerra) && Objects.equals(postoGraduacao, usuario.postoGraduacao) && Objects.equals(matricula, usuario.matricula) && Objects.equals(senha, usuario.senha) && Objects.equals(telefone, usuario.telefone) && Objects.equals(email, usuario.email) && Objects.equals(registroCnh, usuario.registroCnh) && Objects.equals(categoriaCnh, usuario.categoriaCnh) && Objects.equals(validadeCnh, usuario.validadeCnh) && Objects.equals(criadoEm, usuario.criadoEm) && Objects.equals(atualizadoEm, usuario.atualizadoEm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomeDeGuerra, postoGraduacao, matricula, senha, telefone, email, admin, motorista, registroCnh, categoriaCnh, validadeCnh, criadoEm, atualizadoEm);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nomeDeGuerra='" + nomeDeGuerra + '\'' +
                ", postoGraduacao='" + postoGraduacao + '\'' +
                ", matricula='" + matricula + '\'' +
                ", senha='" + senha + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", admin=" + admin +
                ", motorista=" + motorista +
                ", registroCnh='" + registroCnh + '\'' +
                ", categoriaCnh='" + categoriaCnh + '\'' +
                ", validadeCnh=" + validadeCnh +
                ", criadoEm=" + criadoEm +
                ", atualizadoEm=" + atualizadoEm +
                '}';
    }
}
