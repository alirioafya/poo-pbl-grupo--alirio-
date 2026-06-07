package application;

import domain.adocao.Entrevista;

public class AprovarEntrevistaUseCase {

public void executar(Entrevista entrevista) {
entrevista.aprovar();
}
}
