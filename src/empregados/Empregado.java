package empregados;

public class Empregado {
    private String nomecompleto;
    private String endereco;
    private String cpf;

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }


    public Empregado(String nomecompleto, String endereco, String cpf) {
        this.nomecompleto = nomecompleto;
        this.endereco = endereco;
    }

    public String getNomecompleto() {
        return nomecompleto;
    }

    public void setNomecompleto(String nomecompleto) {
        this.nomecompleto = nomecompleto;
    }
}