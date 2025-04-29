package dev.pjonas.sisvtr.services.impl;

import dev.pjonas.sisvtr.models.Usuario;
import dev.pjonas.sisvtr.repos.UsuarioRepo;
import dev.pjonas.sisvtr.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepo repo;


    @Override
    public Usuario criaNovo(Usuario novo) {
        return repo.save(novo);
    }

    @Override
    public Usuario recuperaUsuario(UUID id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Usuario editaUsuario(Usuario usuario) {
        Usuario temp = repo.findById(usuario.getId()).orElse(null);
        if (temp != null) {
            return repo.save(usuario);
        }
        return null;
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return repo.findAll();
    }
}
