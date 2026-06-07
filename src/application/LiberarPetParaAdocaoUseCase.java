package application;

import domain.pet.pet;
import infrastructure.repositories.PetRepository;

public class LiberarPetParaAdocaoUseCase {

private final PetRepository repository;

public LiberarPetParaAdocaoUseCase(
PetRepository repository) {

this.repository = repository;
}

public void executar(Long petId) {

Pet pet = repository
.buscarPorId(petId)
.orElseThrow(
() -> new IllegalArgumentException(
"Pet não encontrado"));

pet.liberarParaAdocao();
}
}
