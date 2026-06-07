package infrastructure.memory;

import domain.pet.Pet;
import infrastructure.repositories.PetRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MemoriaPetRepository implements PetRepository {

private final List<Pet> pets = new ArrayList<>();

@Override
public void salvar(Pet pet) {
pets.add(pet);
}

@Override
public Optional<Pet> buscarPorId(Long id) {
return pets.stream()
.filter(p -> p.getId().equals(id))
.findFirst();
}

@Override
public List<Pet> listarTodos() {
return new ArrayList<>(pets);
}

@Override
public void remover(Long id) {
pets.removeIf(p -> p.getId().equals(id));
}
}
