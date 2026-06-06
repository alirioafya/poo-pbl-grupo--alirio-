public class pet {

    private final Long id;
    private String nome;
    private boolean vacinado;
    private StatusPet status;

    public pet(Long id, String nome) {
        this.id = id;
        this.nome = nome;
        this.vacinado = false;
        this.status = StatusPet.RESGATADO;
    }

    public void registrarVacinacao() {
        this.vacinado = true;
    }

    public void liberarParaAdocao() {

        if (!vacinado) {
            throw new IllegalStateException(
                "Pet não vacinado"
            );
        }

        if (status == StatusPet.EM_TRATAMENTO) {
            throw new IllegalStateException(
                "Pet ainda está em tratamento"
            );
        }

        status = StatusPet.DISPONIVEL_PARA_ADOCAO;
    }

    public boolean estaAptoParaAdocao() {
        return vacinado &&
               status == StatusPet.DISPONIVEL_PARA_ADOCAO;
    }

    public StatusPet getStatus() {
        return status;
    }
}


