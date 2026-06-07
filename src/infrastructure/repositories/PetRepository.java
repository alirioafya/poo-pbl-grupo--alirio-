package infrastructure.repositories;

import domain.pet.pet;
import java.util.List;
import java.util.Optional;

public interface PetRepository {

void salvar(Pet pet);

Optional<Pet> buscarPorId(Long id);

List<Pet> listarTodos();

void remover(Long id);
}
