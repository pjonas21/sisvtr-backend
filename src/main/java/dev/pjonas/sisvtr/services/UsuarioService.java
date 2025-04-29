package dev.pjonas.sisvtr.services;

import dev.pjonas.sisvtr.models.Usuario;

import java.util.List;
import java.util.UUID;

public interface UsuarioService {

    public Usuario criaNovo(Usuario novo);
    public Usuario recuperaUsuario(UUID id);
    public Usuario editaUsuario(Usuario usuario);
    public List<Usuario> listarUsuarios();

}
