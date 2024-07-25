package fatec.poo.model;

/**
 *
 * @author leomoraes
 */
public class Matricula {

    private String dtMatricula;
    private int qtdeFaltas;
    private double media;
    private Aluno aluno;
    private Turma turma;

    public Matricula(String dtMat) {
        dtMatricula = dtMat;
    }

    public void setQtdeFaltas(int qF) {
        qtdeFaltas = qF;
    }

    public void setMedia(double med) {
        media = med;
    }

    public String getDtMatricula() {
        return dtMatricula;
    }

    public int getQtdeFaltas() {
        return qtdeFaltas;
    }

    public double getMedia() {
        return media;
    }

    public void setAluno(Aluno a) {
        aluno = a;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setTurma(Turma t) {
        turma = t;
    }

    public Turma getTurma() {
        return turma;
    }

}
