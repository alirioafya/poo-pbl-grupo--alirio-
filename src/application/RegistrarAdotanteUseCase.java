package application;

import domain.adotante.Adotante;
import domain.adotante.CPF;
import domain.adotante.Email;
import infrastructure.repositories.AdotanteRepository;

public class RegistrarAdotanteUseCase {

private final AdotanteRepository repository;

public RegistrarAdotanteUseCase(
AdotanteRepository repository) {

this.repository = repository;
}

public void executar(
Long id,
String nome,
String cpf,
String email) {

Adotante adotante = new Adotante(
id,
nome,
new CPF(cpf),
new Email(email));

repository.salvar(adotante);
}
}
