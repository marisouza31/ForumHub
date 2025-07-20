package br.com.forumhub.repositories;

import br.com.forumhub.models.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    UserDetails findByEmail(String email);
}
