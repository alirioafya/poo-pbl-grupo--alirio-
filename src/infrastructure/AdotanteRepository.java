package infrastructure.repositories;

import domain.adotante.Adotante;
import java.util.List;
import java.util.Optional;

public interface AdotanteRepository {

void salvar(Adotante adotante);

Optional<Adotante> buscarPorId(Long id);

List<Adotante> listarTodos();

void remover(Long id);
}
