public final class CPF {

    private final String valor;

    public CPF(String valor) {
        if (valor == null || valor.length() != 11) {
            throw new IllegalArgumentException("CPF inválido");
        }
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
