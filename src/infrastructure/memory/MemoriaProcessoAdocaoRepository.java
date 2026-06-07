package infrastructure.memory;

import domain.adocao.ProcessoAdocao;
import infrastructure.repositories.ProcessoAdocaoRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MemoriaProcessoAdocaoRepository
implements ProcessoAdocaoRepository {

private final List<ProcessoAdocao> processos =
new ArrayList<>();

@Override
public void salvar(ProcessoAdocao processo) {
processos.add(processo);
}

@Override
public Optional<ProcessoAdocao> buscarPorId(Long id) {

return processos.stream()
.filter(p -> p.getId().equals(id))
.findFirst();
}

@Override
public List<ProcessoAdocao> listarTodos() {
return new ArrayList<>(processos);
}
}
