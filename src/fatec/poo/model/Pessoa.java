package fatec.poo.model;

/**
 *
 * @author leomoraes
 */
public class Pessoa {

    private String nome;
    private String dtNascimento;
    private String endereco;

    public Pessoa(String n) {
        nome = n;
    }

    public void setDtNascimento(String dN) {
        dtNascimento = dN;
    }

    public void setEndereco(String end) {
        endereco = end;
    }

    public String getNome() {
        return nome;
    }

    public String getdtNascimento() {
        return dtNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

}
