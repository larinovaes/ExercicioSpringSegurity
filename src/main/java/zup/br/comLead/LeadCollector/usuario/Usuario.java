package zup.br.comLead.LeadCollector.usuario;

import javax.persistence.*;
import java.util.UUID;

@Entity //classe de usuario geralmente leva somente esses atributos
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false) //serve para obrigar o usuario colocar esse dados
    private String senha;

    public Usuario() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
