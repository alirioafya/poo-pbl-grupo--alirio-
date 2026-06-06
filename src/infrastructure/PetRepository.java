package infrastructure.repositories;

import domain.pet.pet;
import java.util.List;
import java.util.Optional;

public interface PetRepository {

    void salvar(pet pet);

    Optional<pet> buscarPorId(Long id);

    List<pet> listarTodos();

    void remover(Long id);
}
