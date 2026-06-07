package application;

import domain.adocao.ProcessoAdocao;
import infrastructure.repositories.ProcessoAdocaoRepository;

public class AprovarAdocaoUseCase {

private final ProcessoAdocaoRepository repository;

public AprovarAdocaoUseCase(
ProcessoAdocaoRepository repository) {

this.repository = repository;
}

public void executar(Long processoId) {

ProcessoAdocao processo =
repository.buscarPorId(processoId)
.orElseThrow(
() -> new IllegalArgumentException(
"Processo não encontrado"));

processo.aprovar();
}
}
