package escola;

public class Email {

    private String endereco;

    // VALUE OBJECT
    public Email(String endereco) {
        if (endereco == null || !endereco.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("Email inválido!");
        }

        this.endereco = endereco;

    }
}
