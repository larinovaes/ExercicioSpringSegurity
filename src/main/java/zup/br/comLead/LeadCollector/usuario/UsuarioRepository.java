package zup.br.comLead.LeadCollector.usuario;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UsuarioRepository extends CrudRepository<UUID, Usuario> {
}
