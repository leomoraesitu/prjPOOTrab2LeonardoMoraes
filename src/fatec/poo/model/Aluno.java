package fatec.poo.model;

/**
 *
 * @author leomoraes
 */
public class Aluno extends Pessoa {

    private String ra;
    private String escolaridade;
    private Matricula matricula;

    public Aluno(String ra, String nome) {
        super(nome);
        this.ra = ra;
    }

    public void setEscolaridade(String esc) {
        escolaridade = esc;
    }

    public String getRa() {
        return ra;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setMatricula(Matricula m) {
        matricula = m;
    }

    public Matricula getMatricula() {
        return matricula;
    }
}
