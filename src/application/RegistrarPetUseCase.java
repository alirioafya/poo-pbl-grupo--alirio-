package application;

import domain.pet.pet;
import infrastructure.repositories.PetRepository;

public class RegistrarPetUseCase {

private final PetRepository petRepository;

public RegistrarPetUseCase(PetRepository petRepository) {
this.petRepository = petRepository;
}

public void executar(Long id, String nome) {

Pet pet = new Pet(id, nome);

petRepository.salvar(pet);
}
}
