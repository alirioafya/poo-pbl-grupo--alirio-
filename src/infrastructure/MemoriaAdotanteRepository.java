package infrastructure.memory;

import domain.adotante.Adotante;
import infrastructure.AdotanteRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MemoriaAdotanteRepository implements AdotanteRepository {

private final List<Adotante> adotantes = new ArrayList<>();

@Override
public void salvar(Adotante adotante) {
adotantes.add(adotante);
}

@Override
public Optional<Adotante> buscarPorId(Long id) {
return adotantes.stream()
.filter(a -> a.getId().equals(id))
.findFirst();
}

@Override
public List<Adotante> listarTodos() {
return new ArrayList<>(adotantes);
}

@Override
public void remover(Long id) {
adotantes.removeIf(a -> a.getId().equals(id));
}
}
