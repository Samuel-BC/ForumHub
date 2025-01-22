package alura.ForumHub.dto.usuario;

import alura.ForumHub.model.entities.Usuario;

public record DadosNome(String nome) {

    public DadosNome(Usuario usuario) {
        this(usuario.getNome());
    }
}
