package escola;

public class Telefone {

    private String ddd;
    private String numero;

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Telefone(String ddd, String numero) {
        if(ddd == null || !ddd.matches("\\([1-9]{2}\\)")) {
            throw new IllegalArgumentException("DDD inválido!");
        }
        this.ddd = ddd;
        if(numero == null || !numero.matches("^?\\d{4,}[\\-\\s]?\\d{4}$")) {
            throw new IllegalArgumentException("Telefone inválido!");
        }
        this.numero = numero;
    }
}
