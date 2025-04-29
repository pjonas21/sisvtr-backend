package dev.pjonas.sisvtr.repos;

import dev.pjonas.sisvtr.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, UUID> {
}
