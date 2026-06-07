package infrastructure.repositories;

import domain.adocao.ProcessoAdocao;
import java.util.List;
import java.util.Optional;

public interface ProcessoAdocaoRepository {

void salvar(ProcessoAdocao processo);

Optional<ProcessoAdocao> buscarPorId(Long id);

List<ProcessoAdocao> listarTodos();
}
