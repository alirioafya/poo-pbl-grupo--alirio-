public final class Email {

    private final String valor;

    public Email(String valor) {
        if (valor == null || !valor.contains("@")) {
            throw new IllegalArgumentException("Email inválido");
        }
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
