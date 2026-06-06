public class Adotante {

    private final Long id;
    private final String nome;
    private final CPF cpf;
    private final Email email;

    public Adotante(
            Long id,
            String nome,
            CPF cpf,
            Email email) {

        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }
}
