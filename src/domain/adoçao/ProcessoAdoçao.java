public class ProcessoAdocao {

    private final Pet pet;
    private final Adotante adotante;
    private final Entrevista entrevista;

    private StatusAdocao status;

    public ProcessoAdocao(
            Pet pet,
            Adotante adotante,
            Entrevista entrevista) {

        this.pet = pet;
        this.adotante = adotante;
        this.entrevista = entrevista;
        this.status = StatusAdocao.EM_ANALISE;
    }

    public void aprovar() {

        if (!pet.estaAptoParaAdocao()) {
            throw new IllegalStateException(
                "Pet não apto para adoção"
            );
        }

        if (!entrevista.foiAprovada()) {
            throw new IllegalStateException(
                "Entrevista não aprovada"
            );
        }

        status = StatusAdocao.APROVADA;
    }

    public void reprovar() {
        status = StatusAdocao.REPROVADA;
    }

    public StatusAdocao getStatus() {
        return status;
    }
}
